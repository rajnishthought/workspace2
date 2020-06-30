package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import resources.Utils;
import resources.resourcesAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.List;

import TreblePojo.GetMyProfile_Response_Pojo;
import TreblePojo.Interested_Organizations_ResponsePOJO;
import TreblePojo.LoginResponsePojo;

public class StepDefination2_SerializationAndDeserializarion extends Utils{
	
	RequestSpecification req;
	Response res;
	TestDataBuild tdb = new TestDataBuild(); 
	String response;
	static String token;
	
	/**
	 * De-serialization Concept: Check capturing the Login response as LoginResponsePojo class object:
	 * Serialization : Object ---> Json conversion
	 * De-serialization : JSON ---> Object conversion
	 * */
	
	LoginResponsePojo loginresponse;
	
	GetMyProfile_Response_Pojo myprofile;
	
	
	
	    @Given("^give login payload$")
	    public void give_login_payload() throws IOException{
	     
	     req =  given().spec(requestSpecification())
	      	  	.body(tdb.login());
	    }

	    @When("^user call \"([^\"]*)\" with HTTP \"([^\"]*)\" method$")
	    public void user_call_with_HTTP_method(String resource, String method){
	       
	       resourcesAPI restAPI = resourcesAPI.valueOf(resource);
	       
	       if(method.equalsIgnoreCase("POST"))
	    	   loginresponse = req.when().post(restAPI.getResource()).then().extract().as(LoginResponsePojo.class);
	       
	       else if(method.equalsIgnoreCase("GET"))
	    	   myprofile = req.when().get(restAPI.getResource()).then().extract().as(GetMyProfile_Response_Pojo.class);
	    }

	    @Then("^status code is 200$")
	    public void status_code_is_200(){
	    	String statusCode = loginresponse.getStatus();
	    	
	    	System.out.println("Status code---> "  +statusCode);
	    }
	    
	    @Then("^fetch authentication token from the response$")
	    public void fetch_authentication_token_from_the_response(){
	    	token = loginresponse.getAccess_token();
	    	
	    	System.out.println("Access Token--->"  +token);
	    }
	    
	    @Then("^get \"([^\"]*)\" response$")
	    public void get_response(String resource) throws Throwable {
	    	
	    	req = given().spec(requestSpecification()).header("token", token);
	    	
	    	user_call_with_HTTP_method(resource,"GET");
	    	
	    	String statuscode = myprofile.getStatus();
	    	int code = myprofile.getCode();
	    	
	    	System.out.println("Get My Profile Status Code:--->" + statuscode);
	    	System.out.println("Code:-->"  +code);
	    	
	    	List<Interested_Organizations_ResponsePOJO> integrestedOrgs = myprofile.getUser_details().getInterested_organizations();
	    
	    	System.out.println("Total my connected connected orgs are :"  +integrestedOrgs.size());
	    	
	    	for(Interested_Organizations_ResponsePOJO myorgs : integrestedOrgs) {
	    		System.out.println("Organization Names:  " + myorgs.getName() + "Organization Id:  " + myorgs.getOrganization_id());
	    	}
	    }
	}
