package api.DeleteProfile;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.PLCM.Scripts.GetToken;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProfile_SOAP_CL {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void DeleteProfileCLSuccess() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLInvalidCallbackPassword() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLMissingCallbackPassword() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
//		requestParams.put("callback_password","");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileInvalidCallbackUsername() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","");

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
	public void DeleteProfileMissingCallbackUsername() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
//		requestParams.put("callback_username","");

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
	public void DeleteProfileCLInvalidICCID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLMissingICCID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
//		requestParams.put("iccid","");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLInvalidEID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLMissingEID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
//		requestParams.put("eid","");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLInvalidCallback() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLMissingCallback() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLAdminRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLStandardRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLSystemRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLInvalidAPIToken() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
	public void DeleteProfileCLMissingAPIToken() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://54.169.185.213:1880/callback/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");

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
}
