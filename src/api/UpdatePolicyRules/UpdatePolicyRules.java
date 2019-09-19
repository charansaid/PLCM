package api.UpdatePolicyRules;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import api.PLCM.Scripts.GetToken;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdatePolicyRules {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePolicyRulesSuccess() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesMissingRules() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidSubject() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidQualification() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidRulesAction() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidEIDAndICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
		requestParams.put("eid","");
		requestParams.put("iccid","");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesMissingEIDAndICCID() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_password","plcm");
		requestParams.put("callback_username","123");
//		requestParams.put("eid","");
//		requestParams.put("iccid","");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesMissingCallbackPassword() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_username","plcm");
//		requestParams.put("callback_password","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_username","");
		requestParams.put("callback_password","plcm");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesMissingCallbackUsername() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
//		requestParams.put("callback_username","");
		requestParams.put("callback_password","123");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","");
		requestParams.put("callback_username","123");
		requestParams.put("callback_password","plcm");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesMissingCallback() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
//		requestParams.put("callback","");
		requestParams.put("callback_username","123");
		requestParams.put("callback_password","plcm");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesInvalidAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_username","123");
		requestParams.put("callback_password","plcm");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
	public void UpdatePolicyRulesMissingAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/updatePolicyRules";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("callback_username","123");
		requestParams.put("callback_password","plcm");
		requestParams.put("eid","89033023311330000000000417599984");
		requestParams.put("iccid","893107021930482037");
		
		JSONArray rval = new JSONArray();
		
		JSONObject requestParams2 = new JSONObject();
		JSONObject requestParams3 = new JSONObject();
		requestParams3.put("action", "DELETE");
		requestParams3.put("qualification", "Not-Allowed");
		requestParams3.put("subject", "PROFILE");
		
		rval.add(requestParams3);
		
		requestParams2.put("rules", rval);
		
		requestParams.put("pol2",requestParams2);
		
		//System.out.println(requestParams);

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
