package test.asserts;

import data.models.*;
import org.testng.asserts.SoftAssert;

public class CrocodileAsserts {

    public SoftAssert softAssert = new SoftAssert();

    public void assertCreateNewCrocodile(CreateCrocodileResponse createCrocodileResponse, CreateCrocodileRequest createCrocodileRequest) {

        softAssert.assertEquals(createCrocodileResponse.getName(), createCrocodileRequest.getName(), "Name didn't match");
        softAssert.assertEquals(createCrocodileResponse.getSex(), createCrocodileRequest.getSex(), "Sex didn't match");
        softAssert.assertEquals(createCrocodileResponse.getDateOfBirth(), createCrocodileRequest.getDateOfBirth(), "Date of birth didn't match");
        softAssert.assertAll();
    }

    public void assertListOfPublicCrocodiles(GetPublicCrocodileResponse[] getPublicCrocodileResponse) {
        for (int i = 0; i < getPublicCrocodileResponse.length; i++) {
            softAssert.assertFalse(getPublicCrocodileResponse[i].getName().isEmpty(), "Name is not empty");
        }
        softAssert.assertAll();
    }
    public void assertListOfPrivateCrocodiles(GetPrivateCrocodileResponse[] getPrivateCrocodileResponse) {
        for (int i = 0; i < getPrivateCrocodileResponse.length; i++) {
            softAssert.assertFalse(getPrivateCrocodileResponse[i].getName().isEmpty(), "Name is not empty");
        }
        softAssert.assertAll();
    }
    public void assertSinglePublicCrocodile(GetSinglePublicCrocodileResponse getSinglePublicCrocodileResponse) {

            softAssert.assertTrue(getSinglePublicCrocodileResponse.getName().equals("Bert"), "Name is not equals");

        softAssert.assertAll();
    }
    public void assertSinglePrivateCrocodile(GetSinglePrivateCrocodileResponse getSinglePrivateCrocodileResponse) {

        softAssert.assertTrue(getSinglePrivateCrocodileResponse.getName().equals("Jex"), "Name is not equals");

        softAssert.assertAll();
    }
    public void assertEditPrivateCrocodile(EditPrivateCrocodileResponse editPrivateCrocodileResponse, EditPrivateCrocodileRequest editPrivateCrocodileRequest) {

        softAssert.assertEquals(editPrivateCrocodileResponse.getName(), editPrivateCrocodileRequest.getName(), "Name didn't match");
        softAssert.assertEquals(editPrivateCrocodileResponse.getSex(), editPrivateCrocodileRequest.getSex(), "Sex didn't match");
        softAssert.assertEquals(editPrivateCrocodileResponse.getDateOfBirth(), editPrivateCrocodileRequest.getDateOfBirth(), "Date of birth didn't match");
        softAssert.assertAll();
    }
    public void assertPatchPrivateCrocodile(PatchPrivateCrocodileResponse patchPrivateCrocodileResponse, PatchPrivateCrocodileRequest patchPrivateCrocodileRequest) {

        softAssert.assertEquals(patchPrivateCrocodileResponse.getDateOfBirth(), patchPrivateCrocodileRequest.getDateOfBirth(), "Date of birth didn't match");
        softAssert.assertAll();
    }
    public void assertDeletePrivateCrocodile(DeletePrivateCrocodileResponse deletePrivateCrocodileResponse) {

        softAssert.assertNull(deletePrivateCrocodileResponse);

        //softAssert.assertAll();
    }
}
