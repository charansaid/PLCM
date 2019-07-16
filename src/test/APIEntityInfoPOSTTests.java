package test;

import org.testng.Assert;
import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;

public class APIEntityInfoPOSTTests {

	@SuppressWarnings("unchecked")
	@Test(enabled=true)
	public void CreateSm_Success()
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	}
	
		
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 requestParams.put("entity_type", "sm-dp");
		 requestParams.put("entity_api_type", "REST"); 
		 requestParams.put("entity_supplier",  "SATYATECH");
		 requestParams.put("entity_protocol",  "https");
		 requestParams.put("entity_address",  "community.dynamics.com");
		 requestParams.put("entity_port",  "9452");
		 requestParams.put("entity_username",  "API_USER8");
		 requestParams.put("entity_password",  "restapiautomation$@!");
		 requestParams.put("entity_property_file_path",  "/community/dynamics/dynamics.properties/community/dynamics/dynamics.properties/community/dynamics/dynamics.properties");
		 requestParams.put("entity_cert_alias",  "saisr");
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");
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
		 
		 //httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		 
		 httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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


