package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIPProfilePUTTests {

	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidSMDPId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "1000");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.95" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidUPId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","-94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileCustomerOwnerRole() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingDatagenSource() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		//requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingCustomerId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		//requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingSMDPId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		//requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingIccid() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		//requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileAdminRole() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingFallbackAttribute() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		//requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingType() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		//requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidStorageEntity() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidFallbackAttribute() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingUPId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		//requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidDatagenSource() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidType() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfile() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "PositivePProfile");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidAPIToken() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "sdasdmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingAPIToken() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		//httpRequest.header("Authorization", "sdasdmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileStandardRole() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingPPLiveStatus() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		//requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileSuperAdminRole() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "PositiveSAR");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileNonRootCustomer() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidIccId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidPPLiveStatus() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidMsisdn() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileAlreadyExists() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingMsisdn() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		//requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileInvalidCustomerId() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "-0.2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void UpdatePProfileMissingStorageEntity() 
	{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2");
		requestParams.put("datagen_source", "Octarius");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "1227"); 
		requestParams.put("msisdn",  "3740");
		requestParams.put("smdp_id",  "555");
		//requestParams.put("storage_entity","ALCM");
		requestParams.put("type","5G");
		requestParams.put("up_id","94.99" );
		requestParams.put("pp_live_status", "Positive");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
}
