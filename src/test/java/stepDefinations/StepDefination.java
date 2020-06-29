package stepDefinations;

import org.junit.runner.RunWith;

import TreblePojo.Login;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;
import resources.resourcesAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;

public class StepDefination extends Utils{
	
	RequestSpecification req;
	Response res;
	TestDataBuild tdb = new TestDataBuild(); 
	String response;
	
	    @Given("^give login payload$")
	    public void give_login_payload() throws IOException{
	     
	     req =  given().spec(requestSpecification())
	      	  	.body(tdb.login());
	    }

	    @When("^user call \"([^\"]*)\" with HTTP \"([^\"]*)\" method$")
	    public void user_call_with_HTTP_method(String resource, String method){
	       
	       resourcesAPI restAPI = resourcesAPI.valueOf(resource);
	       
	       if(method.equalsIgnoreCase("POST"))
	       res = req.when().post(restAPI.getResource()).then().extract().response();
	    }

	    @Then("^status code is 200$")
	    public void status_code_is_200(){
	    	response = res.asString();
	    	System.out.println("Response"  +response);	
	    }
	    
	    @Then("^fetch authentication token from the response$")
	    public void fetch_authentication_token_from_the_response(){
	       
	    	String accesstoken = getJsonPath(res, "access_token");
	    	
	    	System.out.println("Access Token"   +accesstoken);
	    }
	}
