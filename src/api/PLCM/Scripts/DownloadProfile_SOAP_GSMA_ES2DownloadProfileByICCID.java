package api.PLCM.Scripts;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DownloadProfile_SOAP_GSMA_ES2DownloadProfileByICCID {

	GetToken TN = new GetToken(); 
	public String TV;

	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPWithUPId() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPInvalidCustomerIdForICCID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPInvalidUPIdForICCID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPReservedAssignedProfile() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		//requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPICCIDReservedAssignedProfileReservationDateInFuture() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPICCIDReservedAssignedProfileReservationTokenExpired() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPICCIDReservedAssignedSMDPIdFromSMDPIdentifier() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPICCIDReservedAssignedSMDPIdFromSMDPIdentifierCopy() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPInvalidCallback() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","'https://localhost:8445/v2/PLCM.CallbackHandler'");
		requestParams.put("eid","89033023311330000000000417601245");
		//requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPMissingCallback() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		//requestParams.put("callback","'https://localhost:8445/v2/PLCM.CallbackHandler'");
		requestParams.put("eid","89033023311330000000000417601245");
		//requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPInvalidEID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","'890330233113300000000004176012'");
		//requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPMissingEID() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		//requestParams.put("eid","890330233113300000000004176012");
		//requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
		public void DownloadProfileSOAPWithICCID() throws Exception{
			
			RestAssured.useRelaxedHTTPSValidation();
			RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
			RequestSpecification httpRequest = RestAssured.given();
	
			JSONObject requestParams = new JSONObject();
			requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
			requestParams.put("eid","890330233113300000000004176012");
			requestParams.put("iccid","893107021930500040");
			requestParams.put("callback_username","plcm");
			requestParams.put("callback_password","123");
			requestParams.put("enable_profile","false");
	//		requestParams.put("up_id","5014v2");
	//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");
	
			TV = TN.fetch("sa");
	
			httpRequest.header("Authorization", "Bearer "+TV);
			httpRequest.header("Content-Type", "application/json");
	
			httpRequest.body(requestParams.toJSONString());
			Response response = httpRequest.request(Method.POST);
	
			int statusCode = response.getStatusCode();
			System.out.println("The status code recieved: " + statusCode);
	
			System.out.println("Response body: " + response.body().asString());
	
			Assert.assertEquals(statusCode, 202);
		}

	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPWithBothICCIDAndUPId() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","890330233113300000000004176012");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPValidICCIDAndInvalidUPId() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPInValidICCIDAndvalidUPId() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","89310702193050004");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPStandardRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("user");

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
	public void DownloadProfileSOAPSystemRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPAdminRole() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("admin");

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
	public void DownloadProfileSOAPICCIDNotInPLCM() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","8931070219305000001");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPEIDNotInPLCM() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601111");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPNotDownloadedInQuarantineTrue() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPNotDownloadedQuarantineDateEqualsCurrentDate() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPProfileDownload_Enabled() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930482050");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPProfileDownload_Disabled() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500006");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPEnableProfileParamTrue() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","true");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPInvalidEnableProfileParam() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","'true'");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPMissingEnableProfileParam() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
//		requestParams.put("enable_profile","'true'");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

		TV = TN.fetch("sa");

		httpRequest.header("Authorization", "Bearer "+TV);
		httpRequest.header("Content-Type", "application/json");

		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.request(Method.POST);

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());

		Assert.assertEquals(statusCode, 202);
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void DownloadProfileSOAPInvalidCallbackPassword() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","'123'");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPMissingCallbackPassword() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
//		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPInvalidCallbackUsername() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","'plcm'");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPMissingCallbackUsername() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
//		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPInvalidCallbackURL() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","'https://localhost:8445/v2/PLCM.CallbackHandler'");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPInvalidAPIToken() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
		requestParams.put("enable_profile","false");
		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
	public void DownloadProfileSOAPMissingAPIToken() throws Exception{
		
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI ="https://localhost:8445/v2/downloadProfile";
		RequestSpecification httpRequest = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("callback","https://localhost:8445/v2/PLCM.CallbackHandler");
		requestParams.put("eid","89033023311330000000000417601245");
		requestParams.put("iccid","893107021930500040");
		requestParams.put("callback_username","plcm");
		requestParams.put("callback_password","123");
//		requestParams.put("enable_profile","false");
//		requestParams.put("up_id","5014v2");
//		requestParams.put("reservation_token","190619ec3c28a013f44a19bc57ba2e8ac23b3a");

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
