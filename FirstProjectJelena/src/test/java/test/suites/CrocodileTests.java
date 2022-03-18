package test.suites;

import calls.CrocodilesAPI;
import test.common.TestBase;
import data.models.*;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.asserts.CrocodileAsserts;

public class CrocodileTests extends TestBase {
    @Test
    public void loginTests() {

        Assert.assertFalse(accessToken.isEmpty(), "Access token is empty");

    }

    @Test
    @Description("verify if crocodile is created")
    public void createCrocodileTest() {
        CreateCrocodileRequest createCrocodileRequest = new CreateCrocodileRequest("Novi3", "M", "2000-12-12");

        CreateCrocodileResponse createCrocodileResponse = CrocodilesAPI.createNewCrocodile(accessToken, createCrocodileRequest);
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertCreateNewCrocodile(createCrocodileResponse, createCrocodileRequest);


    }

    @Test
    @Description("get list")
    public void getListOfPublicCrocodiles() {
        GetPublicCrocodileResponse[] getPublicCrocodileResponse = CrocodilesAPI.getPublicCrocodileResponse();
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertListOfPublicCrocodiles(getPublicCrocodileResponse);


    }

    @Test
    @Description("get private list")
    public void getListOfPrivateCrocodiles() {
        GetPrivateCrocodileResponse[] getPrivateCrocodileResponse = CrocodilesAPI.getPrivateCrocodileResponse(accessToken);
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertListOfPrivateCrocodiles(getPrivateCrocodileResponse);


    }

    @Test
    @Description("get single crocodile")
    public void getSinglePublicCrocodile() {
        GetSinglePublicCrocodileResponse getSinglePublicCrocodileResponse = CrocodilesAPI.getSinglePublicCrocodileResponse();
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertSinglePublicCrocodile(getSinglePublicCrocodileResponse);


    }

    @Test
    @Description("get single private crocodile")
    public void getSinglePrivateCrocodile() {
        GetSinglePrivateCrocodileResponse getSinglePrivateCrocodileResponse = CrocodilesAPI.getSinglePrivateCrocodileResponse(accessToken);
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertSinglePrivateCrocodile(getSinglePrivateCrocodileResponse);


    }


    @Test
    @Description("edit private crocodile")
    public void editPrivateCrocodile() {
        EditPrivateCrocodileRequest editPrivateCrocodileRequest = new EditPrivateCrocodileRequest("DemoEdit", "M", "2000-12-12");
        EditPrivateCrocodileResponse editPrivateCrocodileResponse = CrocodilesAPI.editPrivateCrocodileResponse(accessToken, editPrivateCrocodileRequest);
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertEditPrivateCrocodile(editPrivateCrocodileResponse, editPrivateCrocodileRequest);
    }

    @Test
    @Description("patch private crocodile")
    public void patchPrivateCrocodile() {
        PatchPrivateCrocodileRequest patchPrivateCrocodileRequest = new PatchPrivateCrocodileRequest("2020-12-12");
        PatchPrivateCrocodileResponse patchPrivateCrocodileResponse = CrocodilesAPI.patchPrivateCrocodileResponse(accessToken, patchPrivateCrocodileRequest);
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertPatchPrivateCrocodile(patchPrivateCrocodileResponse, patchPrivateCrocodileRequest);
    }

    @Test
    @Description("delete private crocodile")
    public void deletePrivateCrocodile() {
        DeletePrivateCrocodileResponse deletePrivateCrocodileResponse = CrocodilesAPI.deletePrivateCrocodileResponse(accessToken);
        //GetSinglePrivateCrocodileResponse getSinglePrivateCrocodileResponse = CrocodilesAPI.getSinglePrivateCrocodileResponse(accessToken);
        CrocodileAsserts crocodileAsserts = new CrocodileAsserts();
        crocodileAsserts.assertDeletePrivateCrocodile(deletePrivateCrocodileResponse);



    }
}
