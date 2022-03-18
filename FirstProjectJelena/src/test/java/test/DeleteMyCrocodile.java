package test;

import common.RestAssuredFunctions;
import io.restassured.response.Response;

public class DeleteMyCrocodile {

    public static void main(String[] args) {
        String accessToken = GetTokenResponse.login("jatest86", "test123");
        Response response = RestAssuredFunctions.delete("my/crocodiles/1591269/", accessToken);
        System.out.println(response.body().asString());
    }
}
