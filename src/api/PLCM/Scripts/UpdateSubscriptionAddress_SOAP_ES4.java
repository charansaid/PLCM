package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateSubscriptionAddress_SOAP_ES4 {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void UpdateMSISDNGSMASOAP() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdateMSISDNGSMASOAPV1AndNotV2() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v1/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

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
	public void UpdateMSISDNGSMASOAPInvalidIccID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","");
		requestParams.put("msisdn","31637112760");

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
	public void UpdateMSISDNGSMASOAPInvalidMSISDN() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","");

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
	public void UpdateMSISDNGSMASOAPPPLiveStatusNotDownloaded() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdateMSISDNGSMASOAPPPLiveStatusDownloadDisabled() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdateMSISDNGSMASOAPPPLiveStatusDownloadEnabled() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdateMSISDNGSMASOAPStandardRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

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
	public void UpdateMSISDNGSMASuperAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdateMSISDNGSMASystemRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

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
	public void UpdateMSISDNGSMAAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

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
	public void UpdateMSISDNGSMAInvalidAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

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
	public void UpdateMSISDNGSMAMissingAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updateMsisdn";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("iccid","8931070219304820508");
		requestParams.put("msisdn","31637112760");

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
