package api.PLCM.Scripts;

import org.testng.Assert;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;

public class APIEntityInfoPOSTTests{

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSm_Success() throws Exception
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1000"); // Cast
		 requestParams.put("entity_name", "SAI-GSM");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQ");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8888");
		 requestParams.put("entity_username",  "API_USER1");
		 requestParams.put("entity_password",  "restapiautomation");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSm_SuccessAdminRole()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1001"); // Cast
		 requestParams.put("entity_name", "SAI-GSM");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQ");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8888");
		 requestParams.put("entity_username",  "API_USER2");
		 requestParams.put("entity_password",  "restapiautomation");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE2MTAsImV4cCI6MTU2MzI2NTIxMCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjE4MzUxIiwiYXV0aF90aW1lIjoxNTYzMjYxNjEwLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFkbWluQG9hc2lzLXNtYXJ0c2ltLmNvbSIsIm5hbWUiOiJhZG1pbiBPYXNpcyIsImVtYWlsIjoiYWRtaW5Ab2FzaXMtc21hcnRzaW0uY29tIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJDcm1Db21wYW55SWQiOiIzZGFjZWI1Yi00YmQ3LWU2MTEtYmQ5OS0wMDUwNTY5ZDI3YWYiLCJyb2xlIjoiNTVfZVNpbUh1Yl9hZG1pbiIsInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.CmFc9kX2MAQy-zkWqIic7a1dGh4ZWagMiaK9M1IPgZBk_t5yRbVv3XMSNjZvH7gEIh7uPFJkViuOeQsqp0CKO1lLANCXUi-FY3qrrYSnm6o4csgOuWv5c7TwVtpwXrPS6E0ev10B1LLIw7yv8Ttxf1uH8zgCDpxleLhb3-LJ-aVsBvKKFWmnBJs6dBnZPojEUYmEuHXQdVtXZwAj1pZKBeCH6PscwYmL96bnijROvp0aSAYGy8ntGonKTUtHZHOjIm0rH-fl4EIafdXrtyBMkHdnlX4JXvHQyk00zqYmx7o3bKhGhULhi7UuX4ezaIY_vFI904duZGeadP386QoeBw");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 401);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSm_SuccessStandardRole()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1002"); // Cast
		 requestParams.put("entity_name", "SAI-GSM");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQ");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8888");
		 requestParams.put("entity_username",  "API_USER3");
		 requestParams.put("entity_password",  "restapiautomation");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1NTAsImV4cCI6MTU2MzI2NTE1MCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjE4MzUwIiwiYXV0aF90aW1lIjoxNTYzMjYxNTUwLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6InVzZXIxQG9hc2lzLXNtYXJ0c2ltLmNvbSIsIm5hbWUiOiJ1c2VyMSBPYXNpcyIsImVtYWlsIjoidXNlcjFAb2FzaXMtc21hcnRzaW0uY29tIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJDcm1Db21wYW55SWQiOiIzZGFjZWI1Yi00YmQ3LWU2MTEtYmQ5OS0wMDUwNTY5ZDI3YWYiLCJDcm1BY2NvdW50SWQiOiJhODg0YzgzZC00Yzg1LTQ5N2EtYjE2OS05OGViMzk5MTE1YzgiLCJyb2xlIjoiNTVfZVNpbUh1Yl91c2VyIiwic2NvcGUiOlsiZVNpbUh1Yi5BUEkiLCJlU2ltSHViLkdVSSJdLCJhbXIiOlsiY3VzdG9tIl19.YaIC1fweQMpZ5V-1aSS3JQ4Unufet7xbVYEXFYeH_uA0YlMkDisyh26jZdofB2K-U7RpfcV6TeyaJPsvI9DJPiBqIg5_fARmuQZunx0DpfDcIYWBhcVGb1l8PYx0LGVkyMpAfu__XaK23U1IoP6ZQFfk15Kq-V6veWWZZuTZsGNI9PNqxJqLIfLz-nlW28lZyCL9l5vPsdcgLlUaXXBiF7evwZHmFA2e1pPJT8WtnscEfzZD3uRChg6PsiSEANog6sg-wh65ZJcGIVdrqFcTAxelpICWMKjqq-k22SNt673RwiOMVwvRp0hYPReqMvO_ztX4HO2YATZliFPE4uF6kg");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 401);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
/*	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSm_SuccessCustomerOwnerRole()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1003"); // Cast
		 requestParams.put("entity_name", "SAI-GSM");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQ");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8888");
		 requestParams.put("entity_username",  "API_USER4");
		 requestParams.put("entity_password",  "restapiautomation");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 401);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}*/
	
		
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityTypeNotEnum()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1004"); // Cast
		 requestParams.put("entity_name", "SAI-GSM");
		 requestParams.put("entity_type", "SM-DP88");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQ");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8888");
		 requestParams.put("entity_username",  "API_USER5");
		 requestParams.put("entity_password",  "restapiautomation");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityIsSmSr()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1005"); // Cast
		 requestParams.put("entity_name", "SAI-GSM");
		 requestParams.put("entity_type", "sm-sr");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQ");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8888");
		 requestParams.put("entity_username",  "API_USER6");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityIsClosedLoop()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1006"); // Cast
		 requestParams.put("entity_name", "DSC-GSR");
		 requestParams.put("entity_type", "CLOSED-LOOP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQSYS");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER7");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 200);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmPropsFileMoreThan40Chars()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1007"); // Cast
		 requestParams.put("entity_name", "GMR-MGR");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "SATYATECH");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "9452");
		 requestParams.put("entity_username",  "API_USER8");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics/community/dynamics/dynamics/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 200);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmIncorrectURL()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/smsr";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "A1008"); // Cast
		 requestParams.put("entity_name", "GMR-MGR");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "SATYATECH");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "9452");
		 requestParams.put("entity_username",  "API_USER8");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "saimindq");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 404);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmInvalidAPIToken()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "A1009"); // Cast
		 requestParams.put("entity_name", "DSC-GSR");
		 requestParams.put("entity_type", "sm-sr");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "DURGASOFT");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER9");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "saimindq");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjA3NjgwNjQsImV4cCI6MTU2MDc3MTY2NCwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYwNzY4MDY0LCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.T3GUVLkL2h8ZPw7xs1pry-V8q2t6CL3miYxC1pZJy3eKpJGkt-BZ02W3nATEz8lxE6xR4r1CulbFb74Cw8d5yfVhY1Zq6rrxliDF8dTjlSfhWhuwAozmTJ3QIebKq6f2na0lqH9lOrU80_JeufUIAnjFoo5JuixUHtFCDJrwyqt3iE7wfk0dBAdPGv8DvqBHa9NTvNPLXNkRaZpBesIZozXxD5WAqRcefC8dl3b1tTd_oCbOVWaA6wDaAGtHEsB_6IoULX6mWSmzWwg-K4mUmSX5Y0HRFN43VWl6IVyPefJSHykLqPe9moGTYJijjjsORJm0W8KhEEXhgQcXxx3j6g");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 401);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmAPITokenMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1010A"); // Cast
		 requestParams.put("entity_name", "HYD-BNG");
		 requestParams.put("entity_type", "sm-sr");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "DURGASOFT");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER10");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "saimindq");
		 
		 //httpRequest.header("Authorization", "Bearer ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmAlreadyExists()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1011B"); // Cast
		 requestParams.put("entity_name", "HYD-NLR");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "MINDQSYS");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "callback.example.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER11");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/callback/example/example.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 200);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityIdMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
//		 requestParams.put("entity_id", ""); // Cast
		 requestParams.put("entity_name", "XYZ-ABC");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "KRAKEN");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER12");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "saicharnad");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityNameMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1013C"); // Cast
		 //requestParams.put("entity_name", "");
		 requestParams.put("entity_type", "SM-DP");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "KRAKEN");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "8800");
		 requestParams.put("entity_username",  "API_USER13");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "saicharnad");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityTypeMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1014C"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 //requestParams.put("entity_type", "");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "1010");
		 requestParams.put("entity_username",  "API_USER14");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "saicharnad");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityAPITypeMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1015C"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 requestParams.put("entity_type", "sm-dp");
		 //requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "8080");
		 requestParams.put("entity_username",  "API_USER15");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "durgasoftsol");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntitySupplierMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1016C"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 //requestParams.put("entity_supplier",  "");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "8080");
		 requestParams.put("entity_username",  "API_USER15");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "durgasoftsol");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityProtocolMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1017"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 //requestParams.put("entity_protocol",  "");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER16");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "durgasoftsol");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityAddressMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1018"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 requestParams.put("entity_protocol",  "https");
		 //requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "8899");
		 requestParams.put("entity_username",  "API_USER16");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "durgasoftsol");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityPortMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1019"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 //requestParams.put("entity_port",  "");
		 requestParams.put("entity_username",  "API_USER18");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "durgasoftsol");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityUserNameMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1020"); // Cast
		 requestParams.put("entity_name", "PQR-ABC");
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "sai.charan.com");
		 requestParams.put("entity_port",  "8080");
		 //requestParams.put("entity_username",  "");
		 requestParams.put("entity_password",  "restapi$@!");
		 requestParams.put("entity_property_file_path",  "/sai/charan/charan.properties");
		 requestParams.put("entity_cert_alias",  "saicharnad");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityPasswordMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "SAID8"); // Cast
		 requestParams.put("entity_name", "IJK-LMN");
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "WEYLAND");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "8080");
		 requestParams.put("entity_username",  "API_USER17");
		 //requestParams.put("entity_password",  "");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "durgasoftsol");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSmEntityPropertyFilePathMissing()
	{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/sm";
		RequestSpecification httpRequest = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("entity_id", "1019"); // Cast
		 requestParams.put("entity_name", "PGR-MGR");
		 requestParams.put("entity_type", "sm-sr");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "JOULES");
		 requestParams.put("entity_protocol",  "http");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "9900");
		 requestParams.put("entity_username",  "API_USER18");
		 requestParams.put("entity_password",  "restapi$@!");
		 //requestParams.put("entity_property_file_path",  "");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IkIwNjdCQTc0Qzg5OUMxRUJCQTlFRURENjEyRENCMDNCNzlCQjQzREQiLCJ0eXAiOiJKV1QiLCJ4NXQiOiJzR2U2ZE1pWndldTZudTNXRXR5d08zbTdROTAifQ.eyJuYmYiOjE1NjMyNjE1MjEsImV4cCI6MTU2MzI2NTEyMSwiaXNzIjoiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20iLCJhdWQiOlsiaHR0cHM6Ly9hY2MtaWRlbnRpdHkudGVsZWVuYS5jb20vcmVzb3VyY2VzIiwiZVNpbUh1YlNlcnZpY2UiXSwiY2xpZW50X2lkIjoiZVNJTUh1YiIsIk1hbmFnZUVTaW1zIjoidHJ1ZSIsInN1YiI6IjExNjgxIiwiYXV0aF90aW1lIjoxNTYzMjYxNTIxLCJpZHAiOiJsb2NhbCIsInByZWZlcnJlZF91c2VybmFtZSI6IkFTMDA5MjgzN0B0ZWNobWFoaW5kcmEuY29tIiwibmFtZSI6IkFiaGlzaGVrIEt1bWFyIFNhaCIsImVtYWlsIjoiQVMwMDkyODM3QHRlY2htYWhpbmRyYS5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIkNybUNvbXBhbnlJZCI6IjNkYWNlYjViLTRiZDctZTYxMS1iZDk5LTAwNTA1NjlkMjdhZiIsIkNybUFjY291bnRJZCI6ImE4ODRjODNkLTRjODUtNDk3YS1iMTY5LTk4ZWIzOTkxMTVjOCIsInJvbGUiOlsiNTVfQ1VTVE9NRVItVVNFUiIsIjU1X2VTaW1IdWJfdXNlciIsIjU1X2VTaW1IdWJfYWRtaW4iLCI1NV9lU2ltSHViX3N1cGVyX2FkbWluIl0sInNjb3BlIjpbImVTaW1IdWIuQVBJIiwiZVNpbUh1Yi5HVUkiXSwiYW1yIjpbImN1c3RvbSJdfQ.ITZl4u4ggn9PHTkZtV1mepIasB_vVEr2C5NT1AuNSxDkj9EvmIeXGExC6KW8pNKuWPQ4p-bFHRtQno0iwgL1-lDSLbVjzLIUZi3hVpsRgcX_0ey1-5-CkGNHoEXAro-dKuxbgWcjSCK5u0-rL2mQJxjJqdtyonopTjQBfiFCgU9MoTricDbCs_x_tdB3y2OG43-tmFBnkxcBNGBsyXxx-bV7TKSIWiNCLZxBRx0LnQBDrCLmxd4qj8owjaWefyoVBGJkqqXqTpWdl2uAhIGfUzK_BtjDxI_RQT9XCP9WTDFIejCu_kJ6jiyWPn4dUPtnxSsCDONZZm_QKTfMtRSeIQ");
		 httpRequest.header("Content-Type", "application/json");
		 
		 httpRequest.body(requestParams.toJSONString());
		 Response response = httpRequest.request(Method.POST);
		 
		 int statusCode = response.getStatusCode();
		 System.out.println("The status code recieved: " + statusCode);
		 
		 System.out.println("Response body: " + response.body().asString());
		 
		 Assert.assertEquals(statusCode, 400);
		 //String successCode = response.jsonPath().get("SuccessCode");
	}
}


