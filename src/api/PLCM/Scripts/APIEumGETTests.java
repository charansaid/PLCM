package api.PLCM.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIEumGETTests {

	@Test
	public void GetEumStandardRole() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/89");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}
	
	@Test
	public void GetEumV1AndNotV2() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v1/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/53");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 404,"Correct status code");
	}
	
	@Test
	public void GetEumInvalidAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/51");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 401,"Correct status code");
	}
	
	@Test
	public void GetEumMissingAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		//httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/52");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 400,"Correct status code");
	}
	
	@Test
	public void GetEumCustomerOwnerRole() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/999");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}
	
	@Test
	public void GetEumAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/995");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}
	
	@Test
	public void GetEumSuperAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/eum";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/90");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}
}
