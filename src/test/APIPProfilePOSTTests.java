package test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIPProfilePOSTTests {
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateCustomerForPProfile() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "1000"); // Cast
		requestParams.put("customer_name", "SAIBNG01");
		requestParams.put("billing_code", "444.44");
		requestParams.put("parent_id", "");
		requestParams.put("is_root",  "true");
		requestParams.put("notification_url",  "http://notif.oasis.com/url");
		requestParams.put("quarantine_1_duration","200");
		requestParams.put("quarantine_2_duration","300");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	

	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidUPId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "1000"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321244"); 
		requestParams.put("msisdn",  "250702");
		requestParams.put("smdp_id",  "800");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","-45.56" );
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileCustomerOwnerRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "1000"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321244"); 
		requestParams.put("msisdn",  "250702");
		requestParams.put("smdp_id",  "800");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","-45.56");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingDatagenSource() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		//requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingCustomerId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		//requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingSMDPId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		//requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingIccid() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		//requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "addmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		//httpRequest.header("Authorization", "addmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingFallbackAttribute() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		//requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingType() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		//requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidStorageEntity() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidFallbackAttribute() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingUPId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		//requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingProfilePackage() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidSMDPId() {
	
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();
	
		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "-200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");
	
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");
	
		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);
	
		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
	
		System.out.println("Response body: " + response.body().asString());
	
		Assert.assertEquals(statusCode, 400);
	}


	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidDatagenSource() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidType() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfile() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileStandardRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,401);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingPPLiveStatus() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		//requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileSuperAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileWithAlphaNumericCustomer() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "88xyz"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileWithNonRootCustomer() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidIccId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", ""); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidPPLiveStatus() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidMsisdn() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileAlreadyExists() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "1000"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingMsisdn() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "2"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		//requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileInvalidCustomerId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", ""); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreatePProfileMissingStorageEntity() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/pprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "3"); // Cast
		requestParams.put("datagen_source", "Petronas");
		requestParams.put("fallback_attribute", "false");
		requestParams.put("iccid", "321243"); 
		requestParams.put("msisdn",  "250701");
		requestParams.put("smdp_id",  "200");
		//requestParams.put("storage_entity","PLCM");
		requestParams.put("type","4G");
		requestParams.put("up_id","1000");
		requestParams.put("pp_live_status", "Negative");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode,400);
	}
}
