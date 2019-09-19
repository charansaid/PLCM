package api.EnableProfile;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.PLCM.Scripts.GetToken;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EnableProfile_SOAP_GSMA {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	public void EnableProfileGSMAEmptyRequestBody() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();

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
	public void EnableProfileGSMAInvalidURL() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfil";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107101705099575");
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

		Assert.assertEquals(statusCode, 404);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void EnableProfileGSMAV1AndNotV2() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v1/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","893107101705099575");
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

		Assert.assertEquals(statusCode, 404);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void EnableProfileGSMAPprofileNotDownloaded() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930482050");
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
	public void EnableProfileGSMAPprofileNotDownloadedInQuarantineTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930482050");
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
	public void EnableProfileGSMAPprofileDownloadEnabled() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileGSMAPprofileDownloadEnabledInQuarantineTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileGSMAPprofileDownloadDisabledInQuarantineTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void EnableProfileGSMAPprofileDownloadDisabled() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileGSMAEmptyICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
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
	public void EnableProfileGSMAMissingICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
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
	public void EnableProfileGSMAInvalidICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","MNBALJKBNL");
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

		Assert.assertEquals(statusCode, 403);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void EnableProfileGSMAEmptyEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMAMissingEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
//		requestParams.put("eid","");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMAInvalidEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","KGHLJKASJKF");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMAInvalidCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMAEmptyCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMAMissingCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMAStandardRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileGSMASystemRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107101705099575");
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

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void EnableProfileGSMAAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89065012012341234000000000001384");
		requestParams.put("iccid","893107101705099575");
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
	public void EnableProfileSOAP() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPstandardRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPSystemRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPInvalidCallbackPassword() throws Exception{
	
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();
	
		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPMissingCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPInvalidCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
	public void EnableProfileSOAPMissingCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/enableProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
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
}
