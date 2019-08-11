package test;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIEuiccPOSTTests {

	@SuppressWarnings("unchecked")
	@Test
	public void CreateEuiccInvalidBootstrapInfo() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", ""); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

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
	public void CreateEuiccInvalidEumId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

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
	public void CreateEuiccEumIdNotPresentInEumSupplier() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "10");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		
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
	public void CreateEuiccMissingProfile() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	public void CreateEuiccInvalidStorageEntity() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001000");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	public void CreateEuiccInvalidDatagenSourceInProfile() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001000");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

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
	public void CreateEuiccInvalidProfilePackage() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001003");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	public void CreateEuiccInvalidType() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001003");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	public void CreateEuiccInvalidSMSRId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "8.906501201234123e+31");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	@Test(enabled=false)
	public void CreateEuiccInvalidSMDPId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001005");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateEuiccInvalidEuiccType() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001005");
		requestParams.put("euicc_type", "");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	public void CreateEuiccInvalidCustomerId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "");
		requestParams.put("eid", "89065012012341234000000000001005");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		//System.out.println(ja);

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
	public void CreateEuicc() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1000");
		requestParams.put("eid", "8888");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "88");
		requestParams.put("sm_sr_id",  "1.3.6.1.4.1.53460.4.1.4.1");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);
		
		//System.out.println(ja);
		
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccWithOTAId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001018");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccInvalidFallbackAttribute() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001009");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccSuperAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001010");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateEuiccInvalidEid() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		
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
	@Test(enabled=false)
	public void CreateEuiccCustomerOwnerRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccInvalidMSISDN() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001011");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateEuiccInvalidICCId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001012");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);
		
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
	public void CreateEuiccInvalidStatus() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

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
	public void CreateEuiccInvalidUPId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001013");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


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
	@Test(enabled=false)
	public void CreateEuiccAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001016");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccInvalidAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001016");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		httpRequest.header("Authorization", "asdfasddmFsaWQtY3VzdG9tZXIz");
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
	public void CreateEuiccMissingAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001016");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);


		//httpRequest.header("Authorization", "asdfasddmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccStandardRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001016");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		
		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void CreateEuiccInvalidCustomerIdInProfile() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001016");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateEuiccInvalidPPLiveStatus() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001018");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		
		JSONArray ja = new JSONArray();
		//ja.add(requestParams);
		
		JSONObject pv = new JSONObject();
		pv.put("customer_id", "2");
		pv.put("datagen_source", "Oasis");
		pv.put("fallback_attribute", "false");
		pv.put("iccid", "03212430321243");
		pv.put("msisdn", "08624250701");
		pv.put("smdp_id", "200.88.112.6");
		pv.put("storage_entity", "PLCM");
		pv.put("type", "4G");
		pv.put("up_id", "1000");
		pv.put("pp_live_status", "not_downloaded");
		
		ja.add(pv);
		
		requestParams.put("profiles", ja);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
}
