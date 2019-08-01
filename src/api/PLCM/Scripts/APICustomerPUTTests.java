package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APICustomerPUTTests {

	@SuppressWarnings("unchecked")
	@Test
	public void UpdateCustomerMissingParentId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "25.54"); // Cast
		requestParams.put("customer_name", "SAI_BNG1");
		requestParams.put("billing_code", "243.8");
		//requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void UpdateCustomerExistingCustomerId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "24.53"); // Cast
		requestParams.put("customer_name", "SAI_BNG2");
		requestParams.put("billing_code", "243.9");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "31.6"); // Cast
		requestParams.put("customer_name", "SAI_BNG3");
		requestParams.put("billing_code", "244");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerCustomerOwnerRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "31.6"); // Cast
		requestParams.put("customer_name", "SAI_BNG4");
		requestParams.put("billing_code", "244.1");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerIncorrectURL() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/newcustomer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "31.6"); // Cast
		requestParams.put("customer_name", "SAI_BNG5");
		requestParams.put("billing_code", "244.2");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerMissingCustomerBillingCode() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "31.6"); // Cast
		requestParams.put("customer_name", "SAI_BNG6");
		//requestParams.put("billing_code", "244");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void UpdateCustomerMissingIsRoot() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "35.63"); // Cast
		requestParams.put("customer_name", "SAI_BNG7");
		requestParams.put("billing_code", "244.4");
		requestParams.put("parent_id", ""); 
		//requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerAdmin() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "23.52"); // Cast
		requestParams.put("customer_name", "SAI_BNG8");
		requestParams.put("billing_code", "244.5");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
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
	public void UpdateCustomerSuperAdminRole() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "44.72"); // Cast
		requestParams.put("customer_name", "SAI_BNG9");
		requestParams.put("billing_code", "244.6");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerRootCustomerToNonRoot() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "32.61"); // Cast
		requestParams.put("customer_name", "SAI_BNG10");
		requestParams.put("billing_code", "244.7");
		requestParams.put("parent_id", "2.0.5.2"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidNotificationURL() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "39.67"); // Cast
		requestParams.put("customer_name", "SAI_BNG11");
		requestParams.put("billing_code", "244.8");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerMissingAPIToken() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "39.67"); // Cast
		requestParams.put("customer_name", "SAI_BNG12");
		requestParams.put("billing_code", "244.9");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

		//httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
	public void UpdateCustomerMissingCustomerId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		//requestParams.put("customer_id", ""); // Cast
		requestParams.put("customer_name", "SAI_BNG13");
		requestParams.put("billing_code", "245");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void UpdateCustomerIsRootNotBoolean() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "29.58"); // Cast
		requestParams.put("customer_name", "SAI_BNG14");
		requestParams.put("billing_code", "245.1");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "false1");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void UpdateCustomerMissingQuarantine2() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "27.56"); // Cast
		requestParams.put("customer_name", "SAI_BNG15");
		requestParams.put("billing_code", "245.2");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		//requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerMissingQuarantine1() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "36.64"); // Cast
		requestParams.put("customer_name", "SAI_BNG16");
		requestParams.put("billing_code", "245.3");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		//requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidQuarantineDuration1() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "36.64"); // Cast
		requestParams.put("customer_name", "SAI_BNG16");
		requestParams.put("billing_code", "245.4");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidCustomerName() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "42.7"); // Cast
		requestParams.put("customer_name", "");
		requestParams.put("billing_code", "245.5");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerMissingNotifUrlRootCustomer() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "33.62"); // Cast
		requestParams.put("customer_name", "SAI_BNG18");
		requestParams.put("billing_code", "245.6");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		//requestParams.put("notification_url",  "");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerMissingNotifUrlNonRootCustomer() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "34.63"); // Cast
		requestParams.put("customer_name", "SAI_BNG19");
		requestParams.put("billing_code", "245.7");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "18.1");
		//requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidCustomerId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", ""); // Cast
		requestParams.put("customer_name", "SAI_BNG20");
		requestParams.put("billing_code", "245.8");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidParentId() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "24.53"); // Cast
		requestParams.put("customer_name", "SAI_BNG21");
		requestParams.put("billing_code", "245.9");
		requestParams.put("parent_id", "2.0.5.2"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidBillingCode() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "26.55"); // Cast
		requestParams.put("customer_name", "SAI_BNG22");
		requestParams.put("billing_code", "");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerStandardUser() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "28.57"); // Cast
		requestParams.put("customer_name", "SAI_BNG23");
		requestParams.put("billing_code", "246");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerMissingCustomerName() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "45.73"); // Cast
		//requestParams.put("customer_name", "");
		requestParams.put("billing_code", "246.1");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerParamMoreThan100Chars() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "41.69"); // Cast
		requestParams.put("customer_name", "SAI_BNG24");
		requestParams.put("billing_code", "246.2");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url/kristen/stewart/url/kristen/stewart/url/kristen/stewart/url/kristen/stewart/url/kristen/stewart/");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
	public void UpdateCustomerInvalidQuarantineDuration2() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "37.65"); // Cast
		requestParams.put("customer_name", "SAI_BNG25");
		requestParams.put("billing_code", "246.3");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "");

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
	public void UpdateCustomerInvalidIsRoot() {

		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "40.68"); // Cast
		requestParams.put("customer_name", "SAI_BNG26");
		requestParams.put("billing_code", "246.4");
		requestParams.put("parent_id", "2.0.5.2"); 
		requestParams.put("is_root",  "");
		//requestParams.put("root_id",  "18.1");
		requestParams.put("notification_url",  "http://kristen.stewart.com/url");
		requestParams.put("quarantine_1_duration",  "400");
		requestParams.put("quarantine_2_duration",  "500");

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
