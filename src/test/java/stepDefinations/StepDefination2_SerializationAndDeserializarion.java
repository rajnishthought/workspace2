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

import TreblePojo.LoginResponsePojo;

public class StepDefination2_SerializationAndDeserializarion extends Utils{
	
	RequestSpecification req;
	Response res;
	TestDataBuild tdb = new TestDataBuild(); 
	String response;
	
	/**
	 * De-serialization Concept: Check capturing the Login response as LoginResponsePojo class object:
	 * Serialization : Object ---> Json conversion
	 * De-serialization : JSON ---> Object conversion
	 * */
	
	LoginResponsePojo loginresponse;
	
	
	
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
	    }

	    @Then("^status code is 200$")
	    public void status_code_is_200(){
	    	String statusCode = loginresponse.getStatus();
	    	
	    	System.out.println("Status code---> "  +statusCode);
	    }
	    
	    @Then("^fetch authentication token from the response$")
	    public void fetch_authentication_token_from_the_response(){
	    	String token = loginresponse.getAccess_token();
	    	
	    	System.out.println("Access Token--->"  +token);
	    }
	}
