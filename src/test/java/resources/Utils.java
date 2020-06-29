package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	
	RequestSpecification req;
	
	/**
	 * Storing the logs inside the logs.txt (request/ response logging) at Framework level!
	 * */

	public RequestSpecification requestSpecification() throws IOException {
		
		PrintStream log = new PrintStream(new FileOutputStream("logs.txt"));
		
		req = new RequestSpecBuilder().setBaseUri(getGlobalProperty("url"))
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setAccept(ContentType.JSON).build();
		return req;
	}
	
	/**
	 * Properties file: To define the environment values inside the properties file...
	 * */
	
	public static String getGlobalProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\KiwiTech\\eclipse-workspace\\APIFramework\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		
		return prop.getProperty(key);
	}
	
	/**
	 * Generic function : Convert Response String to JSON and fetch the specific value...
	 * 
	 * */
	public String getJsonPath(Response response, String key) {
		
		String rawString = response.asString();
		JsonPath json = new JsonPath(rawString);
		String keyvalue = json.get(key);
		return keyvalue;
	}
}
