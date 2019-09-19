package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DownloadProfile_SOAP_CL {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileByIccIdCLSuccess() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abc");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLInvalidCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","'abcd@123'");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLMissingCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
//		requestParams.put("callback_password","'abcd@123'");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLInvalidCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","'abcd@123'");
		requestParams.put("callback_username","'abcd'");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLMissingCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","'abcd@123'");
//		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLV1AndNotV2() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v1/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLEmptyBody() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","https:http://callback.example.com:1234/");
//		requestParams.put("eid","89310702183000000000000003373107");
//		requestParams.put("iccid","893107021830033771");
//		requestParams.put("callback_password","abcd@123");
//		requestParams.put("callback_username","abcd");
//		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLDownloadDisabled() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLDownloadEnabled() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLDownloadEnabledInQuarantineTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLDownloadDisabledInQuarantineTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLPPLiveStatusNotDownInQuarantineFalse() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLPPLiveStatusNotDownInQuarantineTrue() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https:http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLEmptyCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLInvalidCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","p://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLMissingCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","p://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLMissingICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
//		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLMissingEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
//		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLInvalidEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","'89310702183000000000000003373107'");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLEmptyEID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLInvalidICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","'893107021830033771'");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLEmptyICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLSystemRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
	public void DownloadProfileByIccIdCLStandardRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","http://callback.example.com:1234/");
		requestParams.put("eid","89310702183000000000000003373107");
		requestParams.put("iccid","893107021830033771");
		requestParams.put("callback_password","abcd@123");
		requestParams.put("callback_username","abcd");
		requestParams.put("enable_profile","false");
		
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
}
