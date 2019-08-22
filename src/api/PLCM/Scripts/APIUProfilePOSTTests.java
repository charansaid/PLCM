package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIUProfilePOSTTests {

	GetToken TN = new GetToken();
	public String TV;
	
	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpNameMissing() throws Exception {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1000"); // Cast
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.1");
		requestParams.put("move_version", "56.8.2"); 
		requestParams.put("pp_size",  "800");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "10");

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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidPPSize() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1001"); // Cast
		requestParams.put("up_name", "SAID1227");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.2");
		requestParams.put("move_version", "56.8.3"); 
		requestParams.put("pp_size",  "801S");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "10");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpStatusNonEnum() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1002N"); // Cast
		requestParams.put("up_name", "SAID1228");
		requestParams.put("up_type", "GSM");
		requestParams.put("up_version", "22.3.5.3");
		requestParams.put("move_version", "56.8.4"); 
		requestParams.put("pp_size",  "802S");
		requestParams.put("up_status",  "Validated00");
		
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



	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileParamMoreThan40Chars() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1003"); // Cast
		requestParams.put("up_name", "SAID1229SAID1229SAID1229SAID1229SAID1229SAID1229");
		requestParams.put("up_type", "EDGE");
		requestParams.put("up_version", "22.3.5.4");
		requestParams.put("move_version", "56.8.5"); 
		requestParams.put("pp_size",  "803");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidUPType() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1004"); // Cast
		requestParams.put("up_name", "SAID1230");
		//requestParams.put("up_type", "");
		requestParams.put("up_version", "22.3.5.5");
		requestParams.put("move_version", "56.8.6"); 
		requestParams.put("pp_size",  "804");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidMoveVersion() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1005"); // Cast
		requestParams.put("up_name", "SAID1231");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.6");
		requestParams.put("move_version", ""); 
		requestParams.put("pp_size",  "805");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileCustomerOwnerRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1006"); // Cast
		requestParams.put("up_name", "SAID1234");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.7");
		requestParams.put("move_version", "56.8.7"); 
		requestParams.put("pp_size",  "806");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidUPId() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", ""); // Cast
		requestParams.put("up_name", "SAID1235");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.8");
		requestParams.put("move_version", "56.8.8"); 
		requestParams.put("pp_size",  "807");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1008"); // Cast
		requestParams.put("up_name", "SAID1236");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.9");
		requestParams.put("move_version", "56.8.9"); 
		requestParams.put("pp_size",  "808");
		requestParams.put("up_status",  "Validated");
		
		TV = TN.fetch("admin");

		httpRequest.header("Authorization", "Bearer "+TV);
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
	public void CreateUprofileInvalidAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1009DSC"); // Cast
		requestParams.put("up_name", "SAI1368");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.10");
		requestParams.put("move_version", "56.8.10"); 
		requestParams.put("pp_size",  "809");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpIdMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();

		requestParams.put("up_name", "SAI1369");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.11");
		requestParams.put("move_version", "56.8.11"); 
		requestParams.put("pp_size",  "810");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidURL() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofileee";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1011");
		requestParams.put("up_name", "SAI1370");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.12");
		requestParams.put("move_version", "56.8.12"); 
		requestParams.put("pp_size",  "811");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpStatusUnderTest() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1012");
		requestParams.put("up_name", "SAI1371");
		requestParams.put("up_type", "5G");
		requestParams.put("up_version", "22.3.5.13");
		requestParams.put("move_version", "56.8.13"); 
		requestParams.put("pp_size",  "812");
		requestParams.put("up_status",  "Under Test");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpTypeMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1013");
		requestParams.put("up_name", "SAI1372");
		requestParams.put("up_version", "22.3.5.14");
		requestParams.put("move_version", "56.8.14"); 
		requestParams.put("pp_size",  "813");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofile() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1014");
		requestParams.put("up_name", "SAI1373");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.15");
		requestParams.put("move_version", "56.8.15"); 
		requestParams.put("pp_size",  "814");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileWithSameNameAndId() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1015");
		requestParams.put("up_name", "1015");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.16");
		requestParams.put("move_version", "56.8.16"); 
		requestParams.put("pp_size",  "815");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileAlphaNumericUpId() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "AV1016");
		requestParams.put("up_name", "SAI1375");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.17");
		requestParams.put("move_version", "56.8.17"); 
		requestParams.put("pp_size",  "816");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpVersionMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1017");
		requestParams.put("up_name", "SAI1376");
		requestParams.put("up_type", "LTE");
		//requestParams.put("up_version", "1.2.3");
		requestParams.put("move_version", "56.8.18"); 
		requestParams.put("pp_size",  "817");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidQuarantineTime() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1018");
		requestParams.put("up_name", "SAI1377");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.19");
		requestParams.put("move_version", "56.8.19"); 
		requestParams.put("pp_size",  "818");
		requestParams.put("up_status",  "Validated");
		requestParams.put("quarantine_time",  "-90");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpStatusMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1019");
		requestParams.put("up_name", "SAI1378");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.20");
		requestParams.put("move_version", "56.8.20"); 
		requestParams.put("pp_size",  "819");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileQuarantineTimeMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1020");
		requestParams.put("up_name", "SAI1379");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.21");
		requestParams.put("move_version", "56.8.21"); 
		requestParams.put("pp_size",  "820");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileMissingAPIToken() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1021");
		requestParams.put("up_name", "SAI1380");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.22");
		requestParams.put("move_version", "56.8.22"); 
		requestParams.put("pp_size",  "821");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofilePpSizeMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1022");
		requestParams.put("up_name", "SAI1381");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.23");
		requestParams.put("move_version", "56.8.23"); 
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidUPVersion() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1023");
		requestParams.put("up_name", "SAI1382");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "");
		requestParams.put("move_version", "56.8.24"); 
		requestParams.put("pp_size",  "823");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidUPStatus() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1024");
		requestParams.put("up_name", "SAI1383");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.24");
		requestParams.put("move_version", "56.8.25"); 
		requestParams.put("pp_size",  "824");
		requestParams.put("up_status",  "");

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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileInvalidUPName() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1024");
		requestParams.put("up_name", "");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.25");
		requestParams.put("move_version", "56.8.25"); 
		requestParams.put("pp_size",  "825");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileMoveVersionMissing() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1025");
		requestParams.put("up_name", "SAI1385");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.26"); 
		requestParams.put("pp_size",  "826");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileExists() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1001");
		requestParams.put("up_name", "SAID1227");
		requestParams.put("up_type", "LTE");
		requestParams.put("up_version", "22.3.5.2"); 
		requestParams.put("move_version", "56.8.3");
		requestParams.put("pp_size",  "801S");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileSuperAdminRole() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1027");
		requestParams.put("up_name", "SAID1228");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.28"); 
		requestParams.put("move_version", "56.8.28");
		requestParams.put("pp_size",  "828");
		requestParams.put("up_status",  "Validated");
		
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

	@SuppressWarnings("unchecked")
	@Test
	public void CreateUprofileUpStatusInternal() throws Exception{

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://localhost:8445/v2/uprofile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("up_id", "1027");
		requestParams.put("up_name", "SAID1228");
		requestParams.put("up_type", "VoLTE");
		requestParams.put("up_version", "22.3.5.28"); 
		requestParams.put("move_version", "56.8.28");
		requestParams.put("pp_size",  "828");
		requestParams.put("up_status",  "Internal");
		
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
