package api.PLCM.Scripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIEntityInfoGETTests {

	@Test(enabled=true)
	public void EntityIdExists()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1011B");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status Code is => " + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");

	}

	@Test(enabled=true)
	public void EntityIdExistsStandardRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1NTAsImV4cCI6MTU2MzI2NTE1MCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjE4MzUwIiwiYXV0aF90aW1lIjoxNTYzMjYxNTUwLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIxQG9hc2lzLXNtYXJ0c2ltLmNvbSIsIm5hbWUiOiJ1c2VyMSBPYXNpcyIsImVtYWlsIjoidXNlcjFAb2FzaXMtc21hcnRzaW0uY29tIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJDcm1Db21wYW55SWQiOiIzZGFjZWI1Yi00YmQ3LWU2MTEtYmQ5OS0wMDUwNTY5ZDI3YWYiLCJDcm1BY2NvdW50SWQiOiJhODg0YzgzZC00Yzg1LTQ5N2EtYjE2OS05OGViMzk5MTE1YzgiLCJyb2xlIjoiNTVfZVNpbUh1Yl91c2VyIiwic2NvcGUiOlsiZVNpbUh1Yi5BUEkiLCJlU2ltSHViLkdVSSJdLCJhbXIiOlsiY3VzdG9tIl19.YaIC1fweQMpZ5V-1aSS3JQ4Unufet7xbVYEXFYeH_uA0YlMkDisyh26jZdofB2K-U7RpfcV6TeyaJPsvI9DJPiBqIg5_fARmuQZunx0DpfDcIYWBhcVGb1l8PYx0LGVkyMpAfu__XaK23U1IoP6ZQFfk15Kq-V6veWWZZuTZsGNI9PNqxJqLIfLz-nlW28lZyCL9l5vPsdcgLlUaXXBiF7evwZHmFA2e1pPJT8WtnscEfzZD3uRChg6PsiSEANog6sg-wh65ZJcGIVdrqFcTAxelpICWMKjqq-k22SNt673RwiOMVwvRp0hYPReqMvO_ztX4HO2YATZliFPE4uF6kg");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1002");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test(enabled=true)
	public void EntityIdExistsSuperAdminRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/100");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test(enabled=true)
	public void EntityIdExistsAdminRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE2MTAsImV4cCI6MTU2MzI2NTIxMCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjE4MzUxIiwiYXV0aF90aW1lIjoxNTYzMjYxNjEwLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFkbWluQG9hc2lzLXNtYXJ0c2ltLmNvbSIsIm5hbWUiOiJhZG1pbiBPYXNpcyIsImVtYWlsIjoiYWRtaW5Ab2FzaXMtc21hcnRzaW0uY29tIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJDcm1Db21wYW55SWQiOiIzZGFjZWI1Yi00YmQ3LWU2MTEtYmQ5OS0wMDUwNTY5ZDI3YWYiLCJyb2xlIjoiNTVfZVNpbUh1Yl9hZG1pbiIsInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.CmFc9kX2MAQy-zkWqIic7a1dGh4ZWagMiaK9M1IPgZBk_t5yRbVv3XMSNjZvH7gEIh7uPFJkViuOeQsqp0CKO1lLANCXUi-FY3qrrYSnm6o4csgOuWv5c7TwVtpwXrPS6E0ev10B1LLIw7yv8Ttxf1uH8zgCDpxleLhb3-LJ-aVsBvKKFWmnBJs6dBnZPojEUYmEuHXQdVtXZwAj1pZKBeCH6PscwYmL96bnijROvp0aSAYGy8ntGonKTUtHZHOjIm0rH-fl4EIafdXrtyBMkHdnlX4JXvHQyk00zqYmx7o3bKhGhULhi7UuX4ezaIY_vFI904duZGeadP386QoeBw");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1001");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

/*	@Test(enabled=true)
	public void EntityIdExistsCustomerOwnerRole()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/100");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}
*/
	@Test(enabled=true)
	public void EntityIdExistsAlphaNumeric()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1011B");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test(enabled=true)
	public void V1andnotV2()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v1/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/400");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 404,"Correct status code");
	}

	@Test(enabled=true)
	public void NoEntityExists()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/600");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 200,"Correct status code");
	}

	@Test(enabled=true)
	public void InvalidURL()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/smm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/A1008");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 404,"Correct status code");
	}

	@Test(enabled=true)
	public void InvalidAPIToken()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer {{sa}");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/A1009");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 401,"Correct status code");
	}

	@Test(enabled=true)
	public void MissingAPIToken()
	{   
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://localhost:8445/v2/sm";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		//httpRequest.header("Authorization", "Bearer ");

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/1010A");

		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		int statusCode = response.getStatusCode();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("Status code is =>" + statusCode);
		Assert.assertEquals(statusCode, 400,"Correct status code");
	}

}