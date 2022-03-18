package test;

import common.RestAssuredFunctions;
import io.restassured.response.Response;

public class EditFieldMyCrocodile {

    public static void main(String[] args) {
        String accessToken = GetTokenResponse.login("jatest86", "test123");

        String requestBody = "{\n" +
                "   \"name\" : \"MocoCroco\" \n" +
                "}";


        Response response = RestAssuredFunctions.patch("my/crocodiles/1582136/", accessToken, requestBody);
        System.out.println(response.body().asString());
    }
}
