package stepDefinations;

import org.junit.runner.RunWith;

import TreblePojo.Login;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

import static io.restassured.RestAssured.given;

public class StepDefination extends Utils{
	
	RequestSpecification req;
	Response res;
	TestDataBuild tdb = new TestDataBuild(); 
	
	    @Given("^give login payload$")
	    public void give_login_payload() throws Throwable {
	     
	     req =  given().spec(requestSpecification())
	      	  	.body(tdb.login());
	    }

	    @When("^user call login api with http post method$")
	    public void user_call_login_api_with_http_post_method() throws Throwable {
	       res = req.when().post("/users/login").then().extract().response();
	    }

	    @Then("^status code is 200$")
	    public void status_code_is_200() throws Throwable {
	    	String response = res.asString();
	    	System.out.println("Response"  +response);
	    }
	}
