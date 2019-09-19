package api.DeleteProfile;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.PLCM.Scripts.GetToken;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProfile_SOAP_GSMA {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void DeleteProfileSOAP() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPStandardRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPSystemRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPInvalidCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPMissingCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPInvalidCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPMissingCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPInvalidCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPMissingCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPFallbackAttributeTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000407");
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
	public void DeleteProfileSOAPProfileNotInSMSRORCARD() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/deleteProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000399");
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
}
