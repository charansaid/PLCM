package api.PLCM.Master;

import org.testng.annotations.Test;
import api.PLCM.Scripts.*;

public class PLCM_Collections {

	@Test(priority=1, enabled = true)
	public void SmEntityInfo() throws Exception {

		APIEntityInfoPOSTTests smpost = new APIEntityInfoPOSTTests();

		//sm post requests here
		System.out.println("==============================");
		System.out.println("SM API POST REQUESTS BEGIN HERE");
		System.out.println("==============================");
		System.out.println("Before loading data in to Entity_Info table");
		smpost.CreateSm_Success();
		smpost.CreateSm_SuccessAdminRole();
		//smpost.CreateSm_SuccessCustomerOwnerRole();
		smpost.CreateSm_SuccessStandardRole();
		smpost.CreateSmAlreadyExists();
		smpost.CreateSmAPITokenMissing();
		smpost.CreateSmEntityAddressMissing();
		smpost.CreateSmEntityAPITypeMissing();
		smpost.CreateSmEntityIdMissing();
		smpost.CreateSmEntityIsClosedLoop();
		smpost.CreateSmEntityIsSmSr();
		smpost.CreateSmEntityNameMissing();
		smpost.CreateSmEntityPasswordMissing();
		smpost.CreateSmEntityPortMissing();
		smpost.CreateSmEntityPropertyFilePathMissing();
		smpost.CreateSmEntityProtocolMissing();
		smpost.CreateSmEntitySupplierMissing();
		smpost.CreateSmEntityTypeMissing();
		smpost.CreateSmEntityTypeNotEnum();
		smpost.CreateSmEntityUserNameMissing();
		smpost.CreateSmIncorrectURL();
		smpost.CreateSmInvalidAPIToken();
		smpost.CreateSmPropsFileMoreThan40Chars();
		System.out.println("After loading data in to Entity_Info table");
		System.out.println("===============================");
		System.out.println("SM API POST REQUESTS END HERE");
		System.out.println("==============================");

		APIEntityInfoPUTTests smput = new APIEntityInfoPUTTests();

		//sm put requests here
		System.out.println("==============================");
		System.out.println("SM API PUT REQUESTS BEGIN HERE");
		System.out.println("===============================");
		smput.UpdateSm_Success();
		smput.UpdateSmAdminRole();
		smput.UpdateSmAlreadyExists();
		smput.UpdateSmAPITokenMissing();
		//smput.UpdateSmCustomerOwnerRole();
		smput.UpdateSmEntityAddressMissing();
		smput.UpdateSmEntityAPITypeMissing();
		smput.UpdateSmEntityIdMissing();
		smput.UpdateSmEntityIsClosedLoop();
		smput.UpdateSmEntityIsSmSr();
		smput.UpdateSmEntityNameMissing();
		smput.UpdateSmEntityPasswordMissing();
		smput.UpdateSmEntityPortMissing();
		smput.UpdateSmEntityPropertyFilePathMissing();
		smput.UpdateSmEntityProtocolMissing();
		smput.UpdateSmEntitySupplierMissing();
		smput.UpdateSmEntityTypeMissing();
		smput.UpdateSmEntityTypeNotEnum();
		smput.UpdateSmEntityUserNameMissing();
		smput.UpdateSmIncorrectURL();
		smput.UpdateSmInvalidAPIToken();
		smput.UpdateSmPropsFileMoreThan40Chars();
		smput.UpdateSmStandardRole();
		System.out.println("============================");
		System.out.println("SM API PUT REQUESTS END HERE");
		System.out.println("============================");

		APIEntityInfoGETTests smget = new APIEntityInfoGETTests();

		//sm get requests here
		System.out.println("============================");
		System.out.println("SM API GET REQUESTS BEGIN HERE");
		System.out.println("============================");
		smget.EntityIdExists();
		smget.EntityIdExistsAdminRole();
		smget.EntityIdExistsAlphaNumeric();
		//smget.EntityIdExistsCustomerOwnerRole();
		smget.EntityIdExistsStandardRole();
		smget.EntityIdExistsSuperAdminRole();
		smget.NoEntityExists();
		System.out.println("============================");
		System.out.println("SM API GET REQUESTS END HERE");
		System.out.println("============================");

		APIEntityInfoDELETETests smdelete = new APIEntityInfoDELETETests();

		//sm delete requests here
		System.out.println("============================");
		System.out.println("SM API DELETE REQUESTS BEGIN HERE");
		System.out.println("============================");
		System.out.println("Before deleting data from Entity_Info table");
		smdelete.DeleteEntityIdExists();
		smdelete.DeleteEntityIdExistsAdminRole();
		smdelete.DeleteEntityIdExistsAlphaNumeric();
		//smdelete.DeleteEntityIdExistsCustomerOwnerRole();
		smdelete.DeleteEntityIdExistsStandardRole();
		smdelete.DeleteEntityV1andnotV2();
		smdelete.DeleteWhenInvalidAPIToken();
		smdelete.DeleteWhenInvalidURL();
		smdelete.DeleteWhenMissingAPIToken();
		smdelete.DeleteWhenNoEntityExists();
		System.out.println("After deleting data from Entity_Info table");
		System.out.println("============================");
		System.out.println("SM API DELETE REQUESTS END HERE");
		System.out.println("============================"); 

	}

	@Test(priority=2, enabled = false)
	public void Uprofile() throws Exception{

		APIUProfilePOSTTests uppost = new APIUProfilePOSTTests();

		//uprofile post requests here
		System.out.println("===================================");
		System.out.println("UPROFILE API POST REQUESTS BEGIN HERE");
		System.out.println("===================================");
		System.out.println("Before loading data to unpersonalised_profile table");
		uppost.CreateUprofile();
		uppost.CreateUprofileAdminRole();
		uppost.CreateUprofileAlphaNumericUpId();
		uppost.CreateUprofileCustomerOwnerRole();
		uppost.CreateUprofileExists();
		uppost.CreateUprofileInvalidAPIToken();
		uppost.CreateUprofileInvalidMoveVersion();
		uppost.CreateUprofileInvalidPPSize();
		uppost.CreateUprofileInvalidQuarantineTime();
		uppost.CreateUprofileInvalidUPId();
		uppost.CreateUprofileInvalidUPName();
		uppost.CreateUprofileInvalidUPStatus();
		uppost.CreateUprofileInvalidUPType();
		uppost.CreateUprofileInvalidUPVersion();
		uppost.CreateUprofileInvalidURL();
		uppost.CreateUprofileMissingAPIToken();
		uppost.CreateUprofileMoveVersionMissing();
		uppost.CreateUprofileParamMoreThan40Chars();
		uppost.CreateUprofilePpSizeMissing();
		uppost.CreateUprofileQuarantineTimeMissing();
		uppost.CreateUprofileSuperAdminRole();
		uppost.CreateUprofileUpIdMissing();
		uppost.CreateUprofileUpNameMissing();
		uppost.CreateUprofileUpStatusInternal();
		uppost.CreateUprofileUpStatusMissing();
		uppost.CreateUprofileUpStatusNonEnum();
		uppost.CreateUprofileUpStatusUnderTest();
		uppost.CreateUprofileUpTypeMissing();
		uppost.CreateUprofileUpVersionMissing();
		uppost.CreateUprofileWithSameNameAndId();
		System.out.println("After loading data to unpersonalised_profile table");
		System.out.println("===================================");
		System.out.println("UPROFILE API POST REQUESTS END HERE");
		System.out.println("===================================");

		APIUProfilePUTTests upput = new APIUProfilePUTTests();

		//uprofile put requests here
		System.out.println("===================================");
		System.out.println("UPROFILE API PUT REQUESTS BEGIN HERE");
		System.out.println("===================================");
		upput.UpdateUprofile();
		upput.UpdateUprofileAdminRole();
		upput.UpdateUprofileCustomerOwner();
		upput.UpdateUprofileExists();
		upput.UpdateUprofileInvalidAPIToken();
		upput.UpdateUprofileInvalidPPSize();
		upput.UpdateUprofileInvalidUpId();
		upput.UpdateUprofileInvalidUPName();
		upput.UpdateUprofileInvalidUPStatus();
		upput.UpdateUprofileInvalidUPType();
		upput.UpdateUprofileInvalidUPVersion();
		upput.UpdateUprofileInvalidURL();
		upput.UpdateUprofileMissingAPIToken();
		upput.UpdateUprofileMoveVersionMissing();
		upput.UpdateUprofileParamMoreThan40Chars();
		upput.UpdateUprofilePpSizeMissing();
		upput.UpdateUprofileQuarantineTimeMissing();
		upput.UpdateUprofileStandardRole();
		upput.UpdateUprofileUpIdMissing();
		upput.UpdateUprofileUpNameMissing();
		upput.UpdateUprofileUpStatusInternal();
		upput.UpdateUprofileUpStatusMissing();
		upput.UpdateUprofileUpStatusNonEnum();
		upput.UpdateUprofileUpStatusUnderTest();
		upput.UpdateUprofileUpTypeMissing();
		System.out.println("===================================");
		System.out.println("UPROFILE API PUT REQUESTS END HERE");
		System.out.println("===================================");


		APIUProfileGETTests upget = new APIUProfileGETTests();

		//uprofile get requests here
		System.out.println("===================================");
		System.out.println("UPROFILE API GET REQUESTS BEGIN HERE");
		System.out.println("===================================");
		upget.UprofileExists();
		upget.UprofileExistsAdminRole();
		upget.UprofileExistsAlphaNumeric();
		upget.UprofileExistsCustomerOwnerRole();
		upget.UprofileExistsSuperAdminRole();
		upget.UprofileInvalidAPIToken();
		upget.UprofileInvalidParamName();
		upget.UprofileMissingAPIToken();
		upget.UprofileWhenV1AndNotV2();
		upget.MissingUprofile();
		System.out.println("===================================");
		System.out.println("UPROFILE API GET REQUESTS END HERE");
		System.out.println("===================================");

		APIUProfileDELETETests updel = new APIUProfileDELETETests();

		//uprofile delete requests here
		System.out.println("===================================");
		System.out.println("UPROFILE API DELETE REQUESTS BEGIN HERE");
		System.out.println("===================================");
		System.out.println("Before deleting data from unpersonalised_profile table");
		updel.DeleteMissingUprofile();
		updel.DeleteUprofileExists();
		updel.DeleteUprofileExistsAlphaNumeric();
		updel.DeleteUprofileExistsCustomerOwnerRole();
		updel.DeleteUprofileExistsSuperAdminRole();
		updel.DeleteUprofileInvalidAPIToken();
		updel.DeleteUprofileInvalidParamName();
		updel.DeleteUprofileMissingAPIToken();
		updel.DeleteUprofileWhenV1AndNotV2();
		System.out.println("After deleting data from unpersonalised_profile table");
		System.out.println("===================================");
		System.out.println("UPROFILE API DELETE REQUESTS END HERE");
		System.out.println("===================================");

	}

	@Test(priority=3,enabled=false)
	public void Customer(){

		APICustomerPOSTTests cpost = new APICustomerPOSTTests();

		//customer post requests here
		System.out.println("===================================");
		System.out.println("CUSTOMER API POST REQUESTS BEGIN HERE");
		System.out.println("===================================");
		System.out.println("Before loading data to customer table");
		cpost.CreateCustomer();
		cpost.CreateCustomerAdminRole();
		cpost.CreateCustomerCustomerOwnerRole();
		cpost.CreateCustomerExistingCustomerId();
		cpost.CreateCustomerIncorrectURL();
		cpost.CreateCustomerInvalidAPIToken();
		cpost.CreateCustomerInvalidBillingCode();
		cpost.CreateCustomerInvalidCustomerId();
		cpost.CreateCustomerInvalidCustomerName();
		cpost.CreateCustomerInvalidIsRoot();
		cpost.CreateCustomerInvalidNotificationURL();
		cpost.CreateCustomerInvalidParentId();
		cpost.CreateCustomerInvalidQuarantineDuration1();
		cpost.CreateCustomerInvalidQuarantineDuration2();
		cpost.CreateCustomerIsRootfalse();
		cpost.CreateCustomerIsRootNotBoolean();
		cpost.CreateCustomerMissingAPIToken();
		cpost.CreateCustomerMissingCustomerBillingCode();
		cpost.CreateCustomerMissingCustomerId();
		cpost.CreateCustomerMissingCustomerName();
		cpost.CreateCustomerMissingIsRoot();
		cpost.CreateCustomerMissingNotifUrlNotRoot();
		cpost.CreateCustomerMissingNotifUrlRootCustomer();
		cpost.CreateCustomerMissingParentId();
		cpost.CreateCustomerMissingQuarantine1();
		cpost.CreateCustomerMissingQuarantine2();
		cpost.CreateCustomerParamMoreThan100Chars();
		cpost.CreateCustomerSuperAdminRole();
		System.out.println("After loading data to customer table");
		System.out.println("===================================");
		System.out.println("CUSTOMER API POST REQUESTS END HERE");
		System.out.println("===================================");

		APICustomerPUTTests cput = new APICustomerPUTTests();

		//customer put requests here
		System.out.println("===================================");
		System.out.println("CUSTOMER API PUT REQUESTS HERE");
		System.out.println("===================================");
		cput.UpdateCustomerAdmin();
		cput.UpdateCustomerCustomerOwnerRole();
		cput.UpdateCustomerExistingCustomerId();
		cput.UpdateCustomerIncorrectURL();
		cput.UpdateCustomerInvalidAPIToken();
		cput.UpdateCustomerInvalidBillingCode();
		cput.UpdateCustomerInvalidCustomerId();
		cput.UpdateCustomerInvalidCustomerName();
		cput.UpdateCustomerInvalidIsRoot();
		cput.UpdateCustomerInvalidNotificationURL();
		cput.UpdateCustomerInvalidParentId();
		cput.UpdateCustomerInvalidQuarantineDuration1();
		cput.UpdateCustomerInvalidQuarantineDuration2();
		cput.UpdateCustomerIsRootNotBoolean();
		cput.UpdateCustomerMissingAPIToken();
		cput.UpdateCustomerMissingCustomerBillingCode();
		cput.UpdateCustomerMissingCustomerId();
		cput.UpdateCustomerMissingCustomerName();
		cput.UpdateCustomerMissingIsRoot();
		cput.UpdateCustomerMissingNotifUrlNonRootCustomer();
		cput.UpdateCustomerMissingNotifUrlRootCustomer();
		cput.UpdateCustomerMissingParentId();
		cput.UpdateCustomerMissingQuarantine1();
		cput.UpdateCustomerMissingQuarantine2();
		cput.UpdateCustomerParamMoreThan100Chars();
		cput.UpdateCustomerRootCustomerToNonRoot();
		cput.UpdateCustomerStandardUser();
		cput.UpdateCustomerSuperAdminRole();
		System.out.println("===================================");
		System.out.println("CUSTOMER API PUT REQUESTS END HERE");
		System.out.println("===================================");

		APICustomerGETTests cget = new APICustomerGETTests();

		//customer get requests here
		System.out.println("===================================");
		System.out.println("CUSTOMER API GET REQUESTS BEGIN HERE");
		System.out.println("===================================");
		cget.GetCustomerAdminRole();
		cget.GetCustomerAlphaNumeric();
		cget.GetCustomerCustomerOwnerRole();
		cget.GetCustomerInvalidAPIToken();
		cget.GetCustomerInvalidCustomerIdName();
		cget.GetCustomerMissingAPIToken();
		cget.GetCustomerMissingCustomerId();
		cget.GetCustomerNoCustomerInDb();
		cget.GetCustomerNonRootCustomer();
		cget.GetCustomerStandardRole();
		cget.GetCustomerSuperAdminRole();
		cget.GetCustomerV1AndNotV2();
		System.out.println("===================================");
		System.out.println("CUSTOMER API GET REQUESTS END HERE");
		System.out.println("===================================");

		APICustomerDELETETests cdel = new APICustomerDELETETests();

		//customer delete requests here
		System.out.println("===================================");
		System.out.println("CUSTOMER API DELETE REQUESTS BEGIN HERE");
		System.out.println("===================================");
		System.out.println("Before deleting data from customer table");
		cdel.DeleteCustomer();
		cdel.DeleteCustomerAdminRoleCopy();
		cdel.DeleteCustomerAlphaNumeric();
		cdel.DeleteCustomerCustomerOwnerRole();
		cdel.DeleteCustomerInvalidAPIToken();
		cdel.DeleteCustomerInvalidCustomerIdName();
		cdel.DeleteCustomerMissingAPIToken();
		cdel.DeleteCustomerMissingCustomerId();
		cdel.DeleteCustomerRootCustomer();
		cdel.DeleteCustomerV1AndNotV2();
		System.out.println("After deleting data from customer table");
		System.out.println("===================================");
		System.out.println("CUSTOMER API DELETE REQUESTS END HERE");
		System.out.println("===================================");
	}

	@Test(priority=4,enabled=false)
	public void GetAllCustomers(){

		GetAllCustomersTests getcs = new GetAllCustomersTests();

		//customers get requests here
		System.out.println("===================================");
		System.out.println("CUSTOMERS API GET REQUESTS BEGIN HERE");
		System.out.println("===================================");
		getcs.GetAllCustomers();
		getcs.GetAllCustomersAdminRole();
		getcs.GetAllCustomersCustomerOwnerRole();
		getcs.GetAllCustomersInvalidAPIToken();
		getcs.GetAllCustomersInvalidParamName();
		getcs.GetAllCustomersMissingAPIToken();
		getcs.GetAllCustomersNoCustomersInDb();
		getcs.GetAllCustomersStandardRole();
		System.out.println("===================================");
		System.out.println("CUSTOMERS API GET REQUESTS END HERE");
		System.out.println("===================================");
	}

	@Test(priority=5,enabled=false)
	public void PProfile(){

		APIPProfilePOSTTests pppost = new APIPProfilePOSTTests();

		//pprofile post requests here
		System.out.println("===================================");
		System.out.println("PPROFILE API POST REQUESTS BEGIN HERE");
		System.out.println("===================================");
		System.out.println("Before loading data to personalised_profile table");
		pppost.CreateCustomerForPProfile();
		pppost.CreatePProfileInvalidSMDPId();
		pppost.CreatePProfileInvalidUPId();
		pppost.CreatePProfileCustomerOwnerRole();
		pppost.CreatePProfileMissingDatagenSource();;
		pppost.CreatePProfileMissingCustomerId();
		pppost.CreatePProfileMissingSMDPId();
		pppost.CreatePProfileMissingIccid();
		pppost.CreatePProfileAdminRole();
		pppost.CreatePProfileInvalidAPIToken();
		pppost.CreatePProfileMissingAPIToken();
		pppost.CreatePProfileMissingFallbackAttribute();
		pppost.CreatePProfileMissingType();
		pppost.CreatePProfileInvalidStorageEntity();
		pppost.CreatePProfileInvalidFallbackAttribute();
		pppost.CreatePProfileMissingUPId();
		pppost.CreatePProfileMissingProfilePackage();
		pppost.CreatePProfileInvalidDatagenSource();
		pppost.CreatePProfileInvalidType();
		pppost.CreatePProfile();
		pppost.CreatePProfileStandardRole();
		pppost.CreatePProfileMissingPPLiveStatus();
		pppost.CreatePProfileSuperAdminRole();
		pppost.CreatePProfileWithAlphaNumericCustomer();
		pppost.CreatePProfileWithNonRootCustomer();
		pppost.CreatePProfileMissingStorageEntity();
		pppost.CreatePProfileInvalidIccId();
		pppost.CreatePProfileInvalidPPLiveStatus();
		pppost.CreatePProfileInvalidMsisdn();
		pppost.CreatePProfileAlreadyExists();
		pppost.CreatePProfileInvalidMsisdn();
		pppost.CreatePProfileInvalidCustomerId();
		System.out.println("After loading data to personalised_profile table");
		System.out.println("===================================");
		System.out.println("PPROFILE API POST REQUESTS END HERE");
		System.out.println("===================================");


		APIPProfilePUTTests ppput = new APIPProfilePUTTests();

		//pprofile put requests here
		System.out.println("===================================");
		System.out.println("PPROFILE API PUT REQUESTS BEGIN HERE");
		System.out.println("===================================");
		ppput.UpdatePProfileInvalidSMDPId();
		ppput.UpdatePProfileInvalidUPId();
		ppput.UpdatePProfileCustomerOwnerRole();
		ppput.UpdatePProfileMissingDatagenSource();
		ppput.UpdatePProfileMissingCustomerId();
		ppput.UpdatePProfileMissingSMDPId();
		ppput.UpdatePProfileMissingIccid();
		ppput.UpdatePProfileAdminRole();
		ppput.UpdatePProfileMissingFallbackAttribute();
		ppput.UpdatePProfileMissingType();
		ppput.UpdatePProfileInvalidStorageEntity();
		ppput.UpdatePProfileInvalidFallbackAttribute();
		ppput.UpdatePProfileMissingUPId();
		ppput.UpdatePProfileInvalidDatagenSource();
		ppput.UpdatePProfileInvalidType();
		ppput.UpdatePProfile();
		ppput.UpdatePProfileInvalidAPIToken();
		ppput.UpdatePProfileStandardRole();
		ppput.UpdatePProfileMissingPPLiveStatus();
		ppput.UpdatePProfileSuperAdminRole();
		ppput.UpdatePProfileNonRootCustomer();
		ppput.UpdatePProfileInvalidIccId();
		ppput.UpdatePProfileInvalidPPLiveStatus();
		ppput.UpdatePProfileInvalidMsisdn();
		ppput.UpdatePProfileAlreadyExists();
		ppput.UpdatePProfileInvalidCustomerId();
		ppput.UpdatePProfileMissingStorageEntity();
		System.out.println("===================================");
		System.out.println("PPROFILE API PUT REQUESTS END HERE");
		System.out.println("===================================");

		APIPProfileGETTests ppget = new APIPProfileGETTests();

		//pprofile get requests here

		System.out.println("===================================");
		System.out.println("PPROFILE API GET REQUESTS BEGIN HERE");
		System.out.println("===================================");
		ppget.GetPProfileSuperAdminRole();
		ppget.GetPProfileInvalidParamName();
		ppget.GetPProfileNoPprofilesInDb();
		ppget.GetPProfileMissingAPIToken();
		ppget.GetPProfileCustomerOwnerRole();
		ppget.GetPProfileStandardRole();
		ppget.GetPProfileAdminRole();
		ppget.GetPProfileInvalidAPIToken();
		System.out.println("===================================");
		System.out.println("PPROFILE API GET REQUESTS END HERE");
		System.out.println("===================================");

		APIPProfileDELETETests ppdel = new APIPProfileDELETETests();

		//pprofile delete requests here
		System.out.println("===================================");
		System.out.println("PPROFILE API DELETE REQUESTS BEGIN HERE");
		System.out.println("===================================");
		System.out.println("Before deleting data from personalised_profile table");
		ppdel.DeletePProfile();
		ppdel.DeletePProfileNoPProfileInDb();
		ppdel.DeletePProfileInvalidAPIToken();
		ppdel.DeletePProfileInvalidParamName();
		ppdel.DeletePProfileAdminRole();
		ppdel.DeletePProfileMissingAPIToken();
		ppdel.DeletePProfileCustomerOwnerRole();
		ppdel.DeletePProfileSuperAdminRole();
		System.out.println("After deleting data from personalised_profile table");
		System.out.println("===================================");
		System.out.println("PPROFILE API DELETE REQUESTS END HERE");
		System.out.println("===================================");
	}

	@Test(priority=7,enabled=false)
	public void EUM(){

		APIEumPOSTTests eumpost = new APIEumPOSTTests();

		//eum post requests here
		System.out.println("===================================");
		System.out.println("EUM API POST REQUESTS BEGIN HERE");
		System.out.println("===================================");
		eumpost.CreateEumMissingEumIDAndName();
		eumpost.CreateEumStandardRole();
		eumpost.CreateEumSuperAdminRole();
		eumpost.CreateEumMissingEumId();
		eumpost.CreateEumInvalidEumIdName();
		eumpost.CreateEumInvalidEumName();
		eumpost.CreateEumInvalidAPIToken();
		eumpost.CreateEumMissingAPIToken();
		eumpost.CreateEumInvalidName();
		eumpost.CreateEumV1AndNotV2();
		eumpost.CreateEumExistingEUMId();
		eumpost.CreateEumInvalidEumId();
		eumpost.CreateEumCustomerOwnerRole();
		eumpost.CreateEumAdminRole();
		System.out.println("===================================");
		System.out.println("EUM API POST REQUESTS END HERE");
		System.out.println("===================================");

		APIEumPUTTests eumput = new APIEumPUTTests();

		//eum put requests here
		System.out.println("===================================");
		System.out.println("EUM API PUT REQUESTS BEGIN HERE");
		System.out.println("===================================");
		eumput.UpdateEumMissingEumIDAndName();
		eumput.UpdateEumStandardRole();
		eumput.UpdateEumSuperAdminRole();
		eumput.UpdateEumInvalidAPIToken();
		eumput.UpdateEumMissingAPIToken();
		eumput.UpdateEumInvalidAPIName();
		eumput.UpdateEumV1AndNotV2();
		eumput.UpdateEumExistingEUMId();
		eumput.UpdateEumInvalidEumName();
		eumput.UpdateEumInvalidEumId();
		eumput.UpdateEumCustomerOwnerRole();
		eumput.UpdateEumAdminRole();
		eumput.UpdateEumEumIdNotExists();
		System.out.println("===================================");
		System.out.println("EUM API PUT REQUESTS END HERE");
		System.out.println("===================================");

		APIEumGETTests eumget = new APIEumGETTests();

		//eum get requests here
		System.out.println("===================================");
		System.out.println("EUM API GET REQUESTS BEGIN HERE");
		System.out.println("===================================");
		eumget.GetEumStandardRole();
		eumget.GetEumV1AndNotV2();
		eumget.GetEumInvalidAPIToken();
		eumget.GetEumMissingAPIToken();
		eumget.GetEumCustomerOwnerRole();
		eumget.GetEumAdminRole();
		eumget.GetEumSuperAdminRole();
		System.out.println("===================================");
		System.out.println("EUM API GET REQUESTS END HERE");
		System.out.println("===================================");

		APIEumDELETETests eumdel = new APIEumDELETETests();

		//eum delete requests here
		System.out.println("===================================");
		System.out.println("EUM API DELETE REQUESTS BEGIN HERE");
		System.out.println("===================================");
		eumdel.DeleteEumStandardRole();
		eumdel.DeleteEumV1AndNotV2();
		eumdel.DeleteEumInvalidAPIToken();
		eumdel.DeleteEumMissingAPIToken();
		eumdel.DeleteEumCustomerOwnerRole();
		eumdel.DeleteEumAdminRole();
		eumdel.DeleteEumSuperAdminRole();
		System.out.println("===================================");
		System.out.println("EUM API DELETE REQUESTS END HERE");
		System.out.println("===================================");
	}
}
