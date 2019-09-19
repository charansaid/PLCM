package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AuditCard_SOAP {
	
	GetToken TN = new GetToken(); 
	public String TV;
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAP() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPSystemRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("system");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("admin");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPStandardRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("user");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPEIDNotInDb() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","8903302331133000000000041760");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 403);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPInvalidEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPMissingEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		//requestParams.put("eid","");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPMoreProfilesInResponseThanInDB() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPLessProfilesInResponseThanInDB() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPInvalidAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("invalidapitoken");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPMissingAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("missingapitoken");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPSingleProfile() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601439");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPEntityNotFound() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 403);
	}

	@Test
	@SuppressWarnings("unchecked")
	public void AuditCardSOAPInvalidEntityAddress() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/auditCard";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("eid","89033023311330000000000417601245");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 408);
	}
}
