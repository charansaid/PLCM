package api.PLCM.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APICustomerGETTests {

	@Test
	public void GetCustomerStandardRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/28.57");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerInvalidAPIToken()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/31.6");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 401,"Correct status code");
	}

	@Test
	public void GetCustomerMissingCustomerId()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 405,"Correct status code");
	}

	@Test
	public void GetCustomerV1AndNotV2()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 405,"Correct status code");
	}

	@Test
	public void GetCustomerAdminRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/23.52");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerInvalidCustomerIdName()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/42.7");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerCustomerOwnerRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/47.75");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerAlphaNumeric()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/47.70D");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerMissingAPIToken()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		//httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/30.59");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 400,"Correct status code");
	}

	@Test
	public void GetCustomerSuperAdminRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/44.72");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerNoCustomerInDb()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/42.7");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test
	public void GetCustomerNonRootCustomer()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/customer";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/29.58");

		// Now let us print the body of the message to see what response
		// we have received from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}
}
