package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIUProfileGETTests {

	@Test
	public void MissingUprofile()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/NA");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileExistsCustomerOwnerRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/101");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileExistsAdminRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/101");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileWhenV1AndNotV2()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileExistsAlphaNumeric()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/100A");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileInvalidAPIToken()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/100");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 401,"Correct status code");

	}

	@Test
	public void UprofileExistsSuperAdminRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/101");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileInvalidParamName()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test
	public void UprofileMissingAPIToken()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		//httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 400,"Correct status code");

	}

	@Test
	public void UprofileExists()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/100A");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}
}
