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
import io.restassured.specification.RequestSpecification;

public class Utils {

	
	RequestSpecification req;

	public RequestSpecification requestSpecification() throws IOException {
		
		PrintStream log = new PrintStream(new FileOutputStream("logs.txt"));
		
		//String baseuri = "https://qa.treblenetwork.com/qa/api";
		
		req = new RequestSpecBuilder().setBaseUri(getGlobalProperty("url"))
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setAccept(ContentType.JSON).build();
		return req;
	}
	
	public static String getGlobalProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\KiwiTech\\eclipse-workspace\\APIFramework\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		
		return prop.getProperty(key);
	}
}
