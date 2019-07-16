package test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIUProfilePUTTests {

	@SuppressWarnings("unchecked")
	@Test
	public void UpdateUprofileInvalidUPVersion() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1023"); // Cast
		requestParams.put("up_name", "SAI1382");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "-22.3524");
		requestParams.put("move_version", "56.8.24"); 
		requestParams.put("pp_size",  "823");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "203");

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
	public void UpdateUprofileUpNameMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1000"); // Cast
		//requestParams.put("up_name", "myUProfile1");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.1");
		requestParams.put("move_version", "56.8.2"); 
		requestParams.put("pp_size",  "800");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "10");

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
	public void UpdateUprofileInvalidUPType() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1004"); // Cast
		requestParams.put("up_name", "DSC0013");
		requestParams.put("up_type", "");
		requestParams.put("up_version", "22.3.5.5");
		requestParams.put("move_version", "56.8.6"); 
		requestParams.put("pp_size",  "804");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "50");

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
	public void UpdateUprofileInvalidUPStatus() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1024"); // Cast
		requestParams.put("up_name", "SAI1383");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.24");
		requestParams.put("move_version", "56.8.25"); 
		requestParams.put("pp_size",  "824");
		requestParams.put("up_status",  "");
		requestParams.put("quarantine_time",  "204");

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
	public void UpdateUprofileMoveVersionMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1025"); // Cast
		requestParams.put("up_name", "SAI1385");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.26");
		//requestParams.put("move_version", "2.4.5"); 
		requestParams.put("pp_size",  "826");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "10");

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
	public void UpdateUprofileQuarantineTimeMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1020"); // Cast
		requestParams.put("up_name", "SAI1379");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.21");
		requestParams.put("move_version", "56.8.21"); 
		requestParams.put("pp_size",  "820");
		requestParams.put("up_status",  "Validated");
		//requestParams.put("quarantine_time",  "10");

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
	public void UpdateUprofileInvalidPPSize() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1001"); // Cast
		requestParams.put("up_name", "DSC0010");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.2");
		requestParams.put("move_version", "56.8.3"); 
		requestParams.put("pp_size",  "801S");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "20");

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
	public void UpdateUprofileExists() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1001"); // Cast
		requestParams.put("up_name", "SAID1227");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.27");
		requestParams.put("move_version", "56.8.27"); 
		requestParams.put("pp_size",  "801S");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "20");

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
	public void UpdateUprofileUpStatusMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1019"); // Cast
		requestParams.put("up_name", "SAI1378");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.20");
		requestParams.put("move_version", "56.8.20"); 
		requestParams.put("pp_size",  "819");
		//requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "200");

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
	public void UpdateUprofileInvalidUPName() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1024"); // Cast
		requestParams.put("up_name", "");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.25");
		requestParams.put("move_version", "56.8.25"); 
		requestParams.put("pp_size",  "825");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "205");

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
	public void UpdateUprofilePpSizeMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1022"); // Cast
		requestParams.put("up_name", "SAI1381");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.23");
		requestParams.put("move_version", "56.8.23"); 
		//requestParams.put("pp_size",  "128");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "202");

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
	public void UpdateUprofileInvalidUpId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", ""); // Cast
		requestParams.put("up_name", "DSC0016");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.8");
		requestParams.put("move_version", "56.8.8"); 
		requestParams.put("pp_size",  "807");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "80");

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
	public void UpdateUprofileInvalidAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1009DSC"); // Cast
		requestParams.put("up_name", "DSC0018");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.10");
		requestParams.put("move_version", "56.8.10"); 
		requestParams.put("pp_size",  "809");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "100");

		httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);	
	}

	@SuppressWarnings("unchecked")
	@Test
	public void UpdateUprofileUpIdMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		//requestParams.put("up_id", "100"); // Cast
		requestParams.put("up_name", "DSC0019");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.11");
		requestParams.put("move_version", "56.8.11"); 
		requestParams.put("pp_size",  "810");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "110");

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
	public void UpdateUprofileUpStatusNonEnum() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1002N"); // Cast
		requestParams.put("up_name", "DSC0011");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.3");
		requestParams.put("move_version", "56.8.4"); 
		requestParams.put("pp_size",  "802S");
		requestParams.put("up_status",  "Validated00");
		requestParams.put("quarantine_time",  "30");

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
	public void UpdateUprofileInvalidURL() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofilee";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1011"); // Cast
		requestParams.put("up_name", "DSC0020");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.12");
		requestParams.put("move_version", "56.8.12"); 
		requestParams.put("pp_size",  "811");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "120");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 404);	
	}

	@SuppressWarnings("unchecked")
	@Test
	public void UpdateUprofileUpStatusInternal() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1027"); // Cast
		requestParams.put("up_name", "SAID1228");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.28");
		requestParams.put("move_version", "56.8.28"); 
		requestParams.put("pp_size",  "828");
		requestParams.put("up_status",  "Internal");
		requestParams.put("quarantine_time",  "209");

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
	public void UpdateUprofile() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1014"); // Cast
		requestParams.put("up_name", "DSC0023");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.15");
		requestParams.put("move_version", "56.8.15"); 
		requestParams.put("pp_size",  "814");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "150");

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
	public void UpdateUprofileCustomerOwner() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1006"); // Cast
		requestParams.put("up_name", "DSC0015");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.7");
		requestParams.put("move_version", "56.8.7"); 
		requestParams.put("pp_size",  "806");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "70");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
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
	public void UpdateUprofileAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1008"); // Cast
		requestParams.put("up_name", "DSC0017");
		requestParams.put("up_type", "2G3G4G");
		requestParams.put("up_version", "22.3.5.9");
		requestParams.put("move_version", "56.8.9"); 
		requestParams.put("pp_size",  "808");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "90");

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
	public void UpdateUprofileStandardRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "101"); // Cast
		requestParams.put("up_name", "myUProfile1");
		requestParams.put("up_type", "VoLTE1");
		requestParams.put("up_version", "1.2.3");
		requestParams.put("move_version", "2.4.5"); 
		requestParams.put("pp_size",  "128");
		requestParams.put("up_status",  "Validated");
		//requestParams.put("quarantine_time",  "10");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 401);	
	}

	@SuppressWarnings("unchecked")
	@Test
	public void UpdateUprofileUpTypeMissing() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1013"); // Cast
		requestParams.put("up_name", "DSC0022");
		//requestParams.put("up_type", "VoLTE1");
		requestParams.put("up_version", "22.3.5.14");
		requestParams.put("move_version", "56.8.14"); 
		requestParams.put("pp_size",  "813");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "140");

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
	public void UpdateUprofileParamMoreThan40Chars() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1003"); // Cast
		requestParams.put("up_name", "DSC0012DSC0012DSC0012DSC0012DSC0012DSC0012");
		requestParams.put("up_type", "EDGE");
		requestParams.put("up_version", "22.3.5.4");
		requestParams.put("move_version", "56.8.5"); 
		requestParams.put("pp_size",  "803");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "40");

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
	public void UpdateUprofileUpStatusUnderTest() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1012"); // Cast
		requestParams.put("up_name", "DSC0021");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.13");
		requestParams.put("move_version", "56.8.13"); 
		requestParams.put("pp_size",  "812");
		requestParams.put("up_status",  "Under Test");
		requestParams.put("quarantine_time",  "130");

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
	public void UpdateUprofileMissingAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1021"); // Cast
		requestParams.put("up_name", "SAI1380");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.22");
		requestParams.put("move_version", "56.8.22"); 
		requestParams.put("pp_size",  "821");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "201");

		//httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.PUT);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);	
	}

}
