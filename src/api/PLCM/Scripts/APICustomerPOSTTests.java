package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APICustomerPOSTTests {

	@SuppressWarnings("unchecked")
	@Test
	public void CreateCustomerInvalidQuarantineDuration1() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "22.51"); // Cast
		requestParams.put("customer_name", "SAI_HYD1");
		requestParams.put("billing_code", "1227.8");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration","" );
		requestParams.put("quarantine_2_duration", 200);

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
	public void CreateCustomerAdminRole() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "23.52"); // Cast
		requestParams.put("customer_name", "SAI_HYD2");
		requestParams.put("billing_code", "1227.9");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  101);
		requestParams.put("quarantine_2_duration",  201);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI1");
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
	public void CreateCustomerInvalidParentId() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "24.53"); // Cast
		requestParams.put("customer_name", "SAI_HYD3");
		requestParams.put("billing_code", "1228");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		requestParams.put("root_id",  "18.3");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  102);
		requestParams.put("quarantine_2_duration",  202);

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
	public void CreateCustomerMissingParentId() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "25.54"); // Cast
		requestParams.put("customer_name", "SAI_HYD4");
		requestParams.put("billing_code", "1228.1");
		//requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "false");
		requestParams.put("root_id",  "18.4");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  103);
		requestParams.put("quarantine_2_duration",  203);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerInvalidBillingCode() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "26.55"); // Cast
		requestParams.put("customer_name", "SAI_HYD5");
		requestParams.put("billing_code", "");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		requestParams.put("root_id",  "18.4");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  104);
		requestParams.put("quarantine_2_duration",  204);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerMissingQuarantine2() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "26.55"); // Cast
		requestParams.put("customer_name", "SAI_HYD5");
		requestParams.put("billing_code", "1228.3");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "18.6");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  105);
		//requestParams.put("quarantine_2_duration",  205);

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
	public void CreateCustomer() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "28.57"); 
		requestParams.put("customer_name", "SAI_HYD7");
		requestParams.put("billing_code", "1228.4");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "18.7");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  106);
		requestParams.put("quarantine_2_duration",  206);

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
	public void CreateCustomerIsRootNotBoolean() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "29.58"); 
		requestParams.put("customer_name", "SAI_HYD8");
		requestParams.put("billing_code", "1228.5");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false1");
		//requestParams.put("root_id",  "18.7");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  107);
		requestParams.put("quarantine_2_duration",  207);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerMissingCustomerId() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		//requestParams.put("customer_id", "29.58"); 
		requestParams.put("customer_name", "SAI_HYD9");
		requestParams.put("billing_code", "1228.6");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		requestParams.put("root_id",  "18.9");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  108);
		requestParams.put("quarantine_2_duration",  208);

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
	public void CreateCustomerMissingAPIToken() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "30.59"); 
		requestParams.put("customer_name", "SAI_HYD10");
		requestParams.put("billing_code", "1228.7");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		requestParams.put("root_id",  "19");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  109);
		requestParams.put("quarantine_2_duration",  209);

		//httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIz");
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
	public void CreateCustomerInvalidAPIToken() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "31.60"); 
		requestParams.put("customer_name", "SAI_HYD11");
		requestParams.put("billing_code", "1228.8");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  110);
		requestParams.put("quarantine_2_duration",  210);

		httpRequest.header("Authorization", "indmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerIsRootfalse() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "32.61"); 
		requestParams.put("customer_name", "SAI_HYD12");
		requestParams.put("billing_code", "1228.9");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "19");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  111);
		requestParams.put("quarantine_2_duration",  211);

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
	public void CreateCustomerMissingNotifUrlNotRoot() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "33.62"); 
		requestParams.put("customer_name", "SAI_HYD13");
		requestParams.put("billing_code", "1229");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "19");
		//requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  112);
		requestParams.put("quarantine_2_duration",  212);

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
	public void CreateCustomerMissingNotifUrlRootCustomer() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "34.63"); 
		requestParams.put("customer_name", "SAI_HYD14");
		requestParams.put("billing_code", "1229.1");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19");
		//requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  113);
		requestParams.put("quarantine_2_duration",  213);

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
	public void CreateCustomerInvalidCustomerId() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", ""); 
		requestParams.put("customer_name", "SAI_HYD15");
		requestParams.put("billing_code", "1229.1");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  114);
		requestParams.put("quarantine_2_duration",  214);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerMissingIsRoot() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "35.63"); 
		requestParams.put("customer_name", "SAI_HYD16");
		requestParams.put("billing_code", "1229.2");
		requestParams.put("parent_id", "20.52"); 
		//requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  115);
		requestParams.put("quarantine_2_duration",  215);

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
	public void CreateCustomerMissingQuarantine1() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "36.64"); 
		requestParams.put("customer_name", "SAI_HYD17");
		requestParams.put("billing_code", "1229.3");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		//requestParams.put("quarantine_1_duration",  115);
		requestParams.put("quarantine_2_duration",  216);

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
	public void CreateCustomerInvalidQuarantineDuration2() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "37.65"); 
		requestParams.put("customer_name", "SAI_HYD18");
		requestParams.put("billing_code", "1229.4");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  117);
		//requestParams.put("quarantine_2_duration",  217);

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
	public void CreateCustomerExistingCustomerId() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "24.54"); 
		requestParams.put("customer_name", "SAI_HYD19");
		requestParams.put("billing_code", "1229.5");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  118);
		requestParams.put("quarantine_2_duration",  218);

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
	public void CreateCustomerInvalidNotificationURL() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "39.67"); 
		requestParams.put("customer_name", "SAI_HYD20");
		requestParams.put("billing_code", "1229.5");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "");
		requestParams.put("quarantine_1_duration",  119);
		requestParams.put("quarantine_2_duration",  219);

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
	public void CreateCustomerInvalidIsRoot() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "40.68"); 
		requestParams.put("customer_name", "SAI_HYD21");
		requestParams.put("billing_code", "1229.7");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  120);
		requestParams.put("quarantine_2_duration",  220);

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
	public void CreateCustomerParamMoreThan100Chars() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "41.69"); 
		requestParams.put("customer_name", "SAI_HYD22");
		requestParams.put("billing_code", "1229.8");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url/test/customer/url/test/customer/url/test/customer/url/test/customer/url");
		requestParams.put("quarantine_1_duration",  121);
		requestParams.put("quarantine_2_duration",  221);

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
	@Test
	public void CreateCustomerInvalidCustomerName() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "42.7"); 
		requestParams.put("customer_name", "");
		requestParams.put("billing_code", "1229.9");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  122);
		requestParams.put("quarantine_2_duration",  222);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerMissingCustomerBillingCode() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "43.71"); 
		requestParams.put("customer_name", "SAI_HYD23");
		//requestParams.put("billing_code", "1230");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  123);
		requestParams.put("quarantine_2_duration",  223);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerSuperAdminRole() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "44.72"); 
		requestParams.put("customer_name", "SAI_HYD24");
		requestParams.put("billing_code", "1230");
		requestParams.put("parent_id", ""); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  124);
		requestParams.put("quarantine_2_duration",  224);

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
	public void CreateCustomerMissingCustomerName() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "45.73"); 
		//requestParams.put("customer_name", "");
		requestParams.put("billing_code", "1231.1");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  125);
		requestParams.put("quarantine_2_duration",  225);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerIncorrectURL() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/nocustomer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "45.73"); 
		requestParams.put("customer_name", "SAI_HYD26");
		requestParams.put("billing_code", "1231.2");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "true");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  126);
		requestParams.put("quarantine_2_duration",  226);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXIx");
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
	public void CreateCustomerCustomerOwnerRole() {


		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/customer";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("customer_id", "47.75"); 
		requestParams.put("customer_name", "SAI_HYD27");
		requestParams.put("billing_code", "1231.3");
		requestParams.put("parent_id", "20.52"); 
		requestParams.put("is_root",  "false");
		//requestParams.put("root_id",  "19.5");
		requestParams.put("notification_url",  "http://test.customer.com/url");
		requestParams.put("quarantine_1_duration",  127);
		requestParams.put("quarantine_2_duration",  227);

		httpRequest.header("Authorization", "dmFsaWQtY3VzdG9tZXI3");
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 400);
	}
}
