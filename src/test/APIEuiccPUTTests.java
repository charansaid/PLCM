package test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIEuiccPUTTests {
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidBootstrapInfo() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "8931071017050995,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+"A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidEumId() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "8931071017050995,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccMissingProfile() {
		
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
		/*requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "8931071017050995,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");*/

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void UpdateEuiccInvalidStorageEntity() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112260,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+","+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void UpdateEuiccInvalidDatagenSourceInProfile() {
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001001");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+","+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112260,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidProfilePackage() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112262,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ ","+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidType() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112262,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ ","+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+","+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidSMSRId() {
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001004");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "");
		requestParams.put("status","Available");
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112262,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void UpdateEuiccInvalidSMDPId() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112266,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+","+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidEuiccType() {
		
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "112267,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidCustomerId() {
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "");
		requestParams.put("eid", "89065012012341234000000000009921");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "500");
		requestParams.put("status","Available");
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "8931071017050995,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
	
	@SuppressWarnings("unchecked")
	@Test(enabled=false)
	public void UpdateEuicc() {
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001008");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+" false,"+
				"iccid"+":"+ "8931071017050995,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 200);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void UpdateEuiccInvalidAPIToken() {
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/euicc";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("bootstrap_info", "info"); // Cast
		requestParams.put("customer_id", "1");
		requestParams.put("eid", "89065012012341234000000000001008");
		requestParams.put("euicc_type", "GSMA M2M");
		requestParams.put("eum_id",  "1");
		requestParams.put("sm_sr_id",  "100");
		requestParams.put("status","Available");
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112268,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

		httpRequest.header("Authorization", "admFsaWQtY3VzdG9tZXI1");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);
	}
}
