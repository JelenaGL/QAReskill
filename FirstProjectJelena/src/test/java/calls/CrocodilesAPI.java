package calls;

import common.GsonFunctions;
import common.RestAssuredFunctions;
import data.models.*;

public class CrocodilesAPI {

    public static LoginResponse login(LoginRequest loginRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.post("auth/token/login/", loginRequest), LoginResponse.class);

    }

    public static CreateCrocodileResponse createNewCrocodile(String accessToken, CreateCrocodileRequest createCrocodileRequest) {
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.post("my/crocodiles/", accessToken, createCrocodileRequest), CreateCrocodileResponse.class);
    }

    public static GetPublicCrocodileResponse[] getPublicCrocodileResponse (){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get("/public/crocodiles/"), GetPublicCrocodileResponse[].class);
    }
    public static GetPrivateCrocodileResponse[] getPrivateCrocodileResponse (String accessToken){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get("/my/crocodiles/", accessToken), GetPrivateCrocodileResponse[].class);
    }
    public static GetSinglePublicCrocodileResponse getSinglePublicCrocodileResponse (){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get("/public/crocodiles/1/"), GetSinglePublicCrocodileResponse.class);
    }

    public static GetSinglePrivateCrocodileResponse getSinglePrivateCrocodileResponse (String accessToken){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.get("/my/crocodiles/1582137/", accessToken), GetSinglePrivateCrocodileResponse.class);
    }

    public static EditPrivateCrocodileResponse editPrivateCrocodileResponse (String accessToken, EditPrivateCrocodileRequest editPrivateCrocodileRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.put("/my/crocodiles/1582137/", accessToken, editPrivateCrocodileRequest), EditPrivateCrocodileResponse.class);
    }
    public static PatchPrivateCrocodileResponse patchPrivateCrocodileResponse (String accessToken, PatchPrivateCrocodileRequest patchPrivateCrocodileRequest){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.patch("/my/crocodiles/1582137/", accessToken, patchPrivateCrocodileRequest), PatchPrivateCrocodileResponse.class);
    }


    public static DeletePrivateCrocodileResponse deletePrivateCrocodileResponse (String accessToken){
        return GsonFunctions.parseSuccessResponseToModel(RestAssuredFunctions.delete("/my/crocodiles/1591259/", accessToken), DeletePrivateCrocodileResponse.class);


    }


}