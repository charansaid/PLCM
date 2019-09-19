package api.DisableProfile;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.PLCM.Scripts.GetToken;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DisableProfile_SOAP {
	
	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void DisableProfileSOAP() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPStandardRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPSystemRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPAdminRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPInvalidCallbackPassword() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPMissingCallbackPassword() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPInvalidCallbackUsername() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPMissingCallbackUsername() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPInvalidCallbackURL() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPMissingCallbackURL() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPInvalidICCID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
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
	public void DisableProfileSOAPMissingICCID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
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
	public void DisableProfileSOAPInvalidEID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPMissingEID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
//		requestParams.put("eid","");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPInvalidAPIToken() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	public void DisableProfileSOAPMissingAPIToken() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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
	
	@Test
	@SuppressWarnings("unchecked")
	public void DisableProfileSOAPNotDownloaded() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500006");
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

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DisableProfileSOAPNotDownloadedInQuarantine() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500006");
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

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DisableProfileSOAPDownloadDisabled() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DisableProfileSOAPDownloadDisabledInQuarantineTrue() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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

		Assert.assertEquals(statusCode, 401);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DisableProfileSOAPDownloadEnabledInQuarantineTrue() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/disableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500008");
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

		Assert.assertEquals(statusCode, 401);
	}
}
