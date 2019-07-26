package test;
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

	/*@SuppressWarnings("unchecked")
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

		/*httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "8931071017050995,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+" ,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+","+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "8931071017050995,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112262,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+","+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112264,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+","+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112265,"+
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112266,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+","+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112267,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
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
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	} */
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateEuicc() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445";
		Response res = given().
		queryParam("key","dmFsaWQtY3VzdG9tZXI1").
		body("{"+
		"\"bootstrap_info\":\"info\","+
		"\"customer_id\":1000,"+
		"\"eid\":8888,"+
		"\"euicc_type\":\"GSMA M2M\","+
		"\"eum_id\":1,"+
		"\"sm_sr_id\":100,"+
		"\"status\":\"Available\","+
		"\"profiles\":[\""+"\"{\""+"\"customer_id\": 2,"+
				"\"datagen_source\": \"Oasis\","+
				"\"fallback_attribute\": \"false\","+
				"\"iccid\": 03212430321243,"+
				"\"msisdn\": 08624250701,"+
				"\"smdp_id\": 200.88.112.6,"+
				"\"storage_entity\":\"PLCM\","+
				"\"type\":\"4G\","+
				"\"up_id\":1000,"+
				"\"pp_live_status\":\"not_downloaded\""+"\"}\""+"\"]\""+"}").
		when().
		post("/v2/euicc").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")).extract().response();
		
		String responseString = res.asString();
		System.out.println(responseString);
		
//		JSONObject requestParams = new JSONObject();
//		requestParams.put("bootstrap_info", "info"); // Cast
//		requestParams.put("customer_id", "1000");
//		requestParams.put("eid", "8888");
//		requestParams.put("euicc_type", "GSMA M2M");
//		requestParams.put("eum_id",  "88");
//		requestParams.put("sm_sr_id",  "1.3.6.1.4.1.53460.4.1.4.1");
//		requestParams.put("status","Available");
//		requestParams.put("profiles", profile_value);
//		requestParams.put("\"profiles\":("+"{"+"\"customer_id\": 2,"+
//				"\"datagen_source\": \"Oasis\","+
//				"\"fallback_attribute\": \"false\","+
//				"\"iccid\": 321243,"+
//				"\"msisdn\": 250701,"+
//				"\"smdp_id\": 200,"+
//				"\"storage_entity\":\"PLCM\","+
//				"\"type\":\"4G\","+
//				"\"up_id\":1000,"+
//				"\"pp_live_status\":\"not_downloaded\""+"}"+")");
		
//		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
//		httpRequest.header("Content-Type", "application/json");
//
//		httpRequest.body(requestParams.toJSONString());
//		Response response = httpRequest.request(Method.POST);
//
//		int statusCode = response.getStatusCode();
//		System.out.println("The status code recieved: " + statusCode);
//
//		System.out.println("Response body: " + response.body().asString());
//
//		Assert.assertEquals(statusCode, 200);
	}
	
	/*@SuppressWarnings("unchecked")
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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112281,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+
				"ota_id"+":"+ "300,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+","+
				"iccid"+":"+ "112269,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112270,"+
				"msisdn"+":"+"31637378173,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "8931071017050995,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "8931071017050995,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112271,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+","+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ ","+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "8931071017050995,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112274,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"400,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ ","+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112279,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112279,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112279,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112279,"+
				"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112280,"+
				//"imsi"+":"+ "31637378173,"+
				"msisdn"+":"+"31637378173,"+
				//"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+"not_downloaded,"+"}"+"]");

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
		requestParams.put("profiles","["+"{"+"customer_id"+":"+"1,"+
				"datagen_source"+":"+"Oasis,"+
				"fallback_attribute"+":"+"false,"+
				"iccid"+":"+ "112291,"+
				"imsi"+":"+"31637378173,"+
				"msisdn"+":"+"31637378173,"+
				"profile_package"+":"+ "A04F800102810100821447534D412050726F66696C65205061636B616765830,"+
				"smdp_id"+":"+"200,"+
				"storage_entity"+":"+"PLCM,"+
				"type"+":"+"GSMA,"+
				"up_id"+":"+ "1,"+
				"pp_live_status"+":"+","+"}"+"]");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}*/
}
