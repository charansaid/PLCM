package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIEntityInfoPUTTests {

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void UpdateSm_Success()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("entity_id", "1000"); // Cast
		requestParams.put("entity_name", "SGST-CGST");
		requestParams.put("entity_type", "SM-SR");
		requestParams.put("entity_api_type", "SOAP"); 
		requestParams.put("entity_supplier",  "REMO28");
		requestParams.put("entity_protocol",  "https");
		requestParams.put("entity_address",  "callback1.example88.com");
		requestParams.put("entity_port",  "8899");
		requestParams.put("entity_username",  "API_USER19");
		requestParams.put("entity_password",  "restapiautomation");
		requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");

		httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}

		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmAdminRole()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1001"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "SM-SR");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "REMO28");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8888");
			 requestParams.put("entity_username",  "API_USER22");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
	//		 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE2MTAsImV4cCI6MTU2MzI2NTIxMCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjE4MzUxIiwiYXV0aF90aW1lIjoxNTYzMjYxNjEwLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFkbWluQG9hc2lzLXNtYXJ0c2ltLmNvbSIsIm5hbWUiOiJhZG1pbiBPYXNpcyIsImVtYWlsIjoiYWRtaW5Ab2FzaXMtc21hcnRzaW0uY29tIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJDcm1Db21wYW55SWQiOiIzZGFjZWI1Yi00YmQ3LWU2MTEtYmQ5OS0wMDUwNTY5ZDI3YWYiLCJyb2xlIjoiNTVfZVNpbUh1Yl9hZG1pbiIsInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.CmFc9kX2MAQy-zkWqIic7a1dGh4ZWagMiaK9M1IPgZBk_t5yRbVv3XMSNjZvH7gEIh7uPFJkViuOeQsqp0CKO1lLANCXUi-FY3qrrYSnm6o4csgOuWv5c7TwVtpwXrPS6E0ev10B1LLIw7yv8Ttxf1uH8zgCDpxleLhb3-LJ-aVsBvKKFWmnBJs6dBnZPojEUYmEuHXQdVtXZwAj1pZKBeCH6PscwYmL96bnijROvp0aSAYGy8ntGonKTUtHZHOjIm0rH-fl4EIafdXrtyBMkHdnlX4JXvHQyk00zqYmx7o3bKhGhULhi7UuX4ezaIY_vFI904duZGeadP386QoeBw");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 401);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
	
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmStandardRole()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1002"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "SM-SR");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "REMO28");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8899");
			 requestParams.put("entity_username",  "API_USER20");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1NTAsImV4cCI6MTU2MzI2NTE1MCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjE4MzUwIiwiYXV0aF90aW1lIjoxNTYzMjYxNTUwLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIxQG9hc2lzLXNtYXJ0c2ltLmNvbSIsIm5hbWUiOiJ1c2VyMSBPYXNpcyIsImVtYWlsIjoidXNlcjFAb2FzaXMtc21hcnRzaW0uY29tIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJDcm1Db21wYW55SWQiOiIzZGFjZWI1Yi00YmQ3LWU2MTEtYmQ5OS0wMDUwNTY5ZDI3YWYiLCJDcm1BY2NvdW50SWQiOiJhODg0YzgzZC00Yzg1LTQ5N2EtYjE2OS05OGViMzk5MTE1YzgiLCJyb2xlIjoiNTVfZVNpbUh1Yl91c2VyIiwic2NvcGUiOlsiZVNpbUh1Yi5BUEkiLCJlU2ltSHViLkdVSSJdLCJhbXIiOlsiY3VzdG9tIl19.YaIC1fweQMpZ5V-1aSS3JQ4Unufet7xbVYEXFYeH_uA0YlMkDisyh26jZdofB2K-U7RpfcV6TeyaJPsvI9DJPiBqIg5_fARmuQZunx0DpfDcIYWBhcVGb1l8PYx0LGVkyMpAfu__XaK23U1IoP6ZQFfk15Kq-V6veWWZZuTZsGNI9PNqxJqLIfLz-nlW28lZyCL9l5vPsdcgLlUaXXBiF7evwZHmFA2e1pPJT8WtnscEfzZD3uRChg6PsiSEANog6sg-wh65ZJcGIVdrqFcTAxelpICWMKjqq-k22SNt673RwiOMVwvRp0hYPReqMvO_ztX4HO2YATZliFPE4uF6kg");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 401);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
/*		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmCustomerOwnerRole()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1003"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "SM-SR");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "REMO28");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8888");
			 requestParams.put("entity_username",  "API_USER21");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 401);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}*/
		
			
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityTypeNotEnum()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1004"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "SM-SR88");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "REMO28");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8888");
			 requestParams.put("entity_username",  "API_USER23");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityIsSmSr()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1005"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "sm-sr");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "REMO28");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8888");
			 requestParams.put("entity_username",  "API_USER24");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
	
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityIsClosedLoop()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1006"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "CLOSED-LOOP");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "VENUS");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8899");
			 requestParams.put("entity_username",  "API_USER25");
			 requestParams.put("entity_password",  "restapiautomation$@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 200);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
	
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmPropsFileMoreThan40Chars()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1007"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "SM-DP");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "community1.dynamics88.com");
			 requestParams.put("entity_port",  "9452");
			 requestParams.put("entity_username",  "API_USER26");
			 requestParams.put("entity_password",  "restapiautomation$@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 200);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
	
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmIncorrectURL()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/smsr";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "A1008"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "sm-dp");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "community1.dynamics88.com");
			 requestParams.put("entity_port",  "9452");
			 requestParams.put("entity_username",  "API_USER27");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/community1/dynamics88/dynamics88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 404);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmInvalidAPIToken()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "A1009"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "sm-sr");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8899");
			 requestParams.put("entity_username",  "API_USER28");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer {{sa}");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 401);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmAPITokenMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1010A"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "sm-sr");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8899");
			 requestParams.put("entity_username",  "API_USER29");
			 requestParams.put("entity_password",  "restapiautomation#@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 //httpRequest.header("Authorization", "Bearer");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmAlreadyExists()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1011B"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "SM-SR");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "REMO28");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "callback1.example88.com");
			 requestParams.put("entity_port",  "8899");
			 requestParams.put("entity_username",  "API_USER19");
			 requestParams.put("entity_password",  "restapiautomation$@!");
			 requestParams.put("entity_property_file_path",  "/callback1/example88/example88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 200);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityIdMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 //requestParams.put("entity_id", ""); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "SM-DP");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8800");
			 requestParams.put("entity_username",  "API_USER31");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityNameMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1013C"); // Cast
			 //requestParams.put("entity_name", "");
			 requestParams.put("entity_type", "SM-DP");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8800");
			 requestParams.put("entity_username",  "API_USER32");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityTypeMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1014C"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 //requestParams.put("entity_type", "");
			 requestParams.put("entity_api_type", "SOAP"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8801");
			 requestParams.put("entity_username",  "API_USER33");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityAPITypeMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1015C"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "SM-SR");
			 //requestParams.put("entity_api_type", ""); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8802");
			 requestParams.put("entity_username",  "API_USER34");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntitySupplierMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1016C"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "SM-SR");
			 requestParams.put("entity_api_type", "REST"); 
			 //requestParams.put("entity_supplier",  "");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "8803");
			 requestParams.put("entity_username",  "API_USER35");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityProtocolMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1017"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "SM-SR");
			 requestParams.put("entity_api_type", "REST"); 
			 requestParams.put("entity_supplier",  "JOULES");
			 //requestParams.put("entity_protocol",  "");
			 requestParams.put("entity_address",  "sai1.charan88.com");
			 requestParams.put("entity_port",  "1010");
			 requestParams.put("entity_username",  "API_USER33");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityAddressMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1018"); // Cast
			 requestParams.put("entity_name", "PGR-MGR");
			 requestParams.put("entity_type", "sm-dp");
			 requestParams.put("entity_api_type", "REST"); 
			 requestParams.put("entity_supplier",  "JOULES");
			 requestParams.put("entity_protocol",  "http");
			 //requestParams.put("entity_address",  "");
			 requestParams.put("entity_port",  "8080");
			 requestParams.put("entity_username",  "API_USER34");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityPortMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1019"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "sm-dp");
			 requestParams.put("entity_api_type", "REST"); 
			 requestParams.put("entity_supplier",  "JOULES");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "community1.dynamics88.com");
			 //requestParams.put("entity_port",  "");
			 requestParams.put("entity_username",  "API_USER35");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/sai1/charan88/charan88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityUserNameMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1020"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "sm-dp");
			 requestParams.put("entity_api_type", "REST"); 
			 requestParams.put("entity_supplier",  "JOULES");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "community1.dynamics88.com");
			 requestParams.put("entity_port",  "8899");
			 //requestParams.put("entity_username",  "");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 requestParams.put("entity_property_file_path",  "/community1/dynamics88/dynamics88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityPasswordMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "SAID8"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "sm-dp");
			 requestParams.put("entity_api_type", "REST"); 
			 requestParams.put("entity_supplier",  "JOULES");
			 requestParams.put("entity_protocol",  "http");
			 requestParams.put("entity_address",  "community1.dynamics88.com");
			 requestParams.put("entity_port",  "8899");
			 requestParams.put("entity_username",  "API_USER37");
			 //requestParams.put("entity_password",  "");
			 requestParams.put("entity_property_file_path",  "/community1/dynamics88/dynamics88.properties");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}
		
		@SuppressWarnings("unchecked")
		@Test(enabled=true)
		public void UpdateSmEntityPropertyFilePathMissing()
		{
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/sm";
			RequestSpecification httpRequest = RestAssured.given();
			 
			 JSONObject requestParams = new JSONObject();
			 requestParams.put("entity_id", "1019"); // Cast
			 requestParams.put("entity_name", "SGST-CGST");
			 requestParams.put("entity_type", "sm-sr");
			 requestParams.put("entity_api_type", "REST"); 
			 requestParams.put("entity_supplier",  "NOAHTECH");
			 requestParams.put("entity_protocol",  "https");
			 requestParams.put("entity_address",  "community1.dynamics88.com");
			 requestParams.put("entity_port",  "9900");
			 requestParams.put("entity_username",  "API_USER38");
			 requestParams.put("entity_password",  "SOAPAPI$@!");
			 //requestParams.put("entity_property_file_path",  "");
			 requestParams.put("entity_cert_alias",  "smsr");
			 
			 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
			 httpRequest.header("Content-Type", "application/json");
			 
			 httpRequest.body(requestParams.toJSONString());
			 Response response = httpRequest.request(Method.PUT);
			 
			 int statusCode = response.getStatusCode();
			 System.out.println("The status code recieved: " + statusCode);
			 
			 System.out.println("Response body: " + response.body().asString());
			 
			 Assert.assertEquals(statusCode, 400);
			 //String successCode = response.jsonPath().get("SuccessCode");
		}

}
