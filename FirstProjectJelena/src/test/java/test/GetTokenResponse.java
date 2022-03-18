package test;

import common.RestAssuredFunctions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetTokenResponse {

    public static String login(String userName, String pass) {

        RestAssured.baseURI = "https://test-api.k6.io/";

        String requestBody = "{\n" +
                "\"username\":\"jatest86\", \n" +
                "\"password\":\"test123\" \n " +
                "}";


        Response response = RestAssuredFunctions.post("auth/token/login/", requestBody);
        String responseAsString = response.body().asString();
        String accessToken = responseAsString.substring(responseAsString.indexOf("access\":\"") +9, responseAsString.indexOf("\"}"));

        System.out.println(accessToken);

        return accessToken;
    }
}
