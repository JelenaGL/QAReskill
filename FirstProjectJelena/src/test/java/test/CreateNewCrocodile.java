package test;


import common.RestAssuredFunctions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateNewCrocodile {
    public static void main(String[] args){

        String accessToken = GetTokenResponse.login("jatest86", "test123");

        String requestBody = "{\n" +
                "\"name\": \"Cho\", \n" +
                "\"sex\": \"M\", \n" +
                "\"date_of_birth\":\"1990-01-01\" \n " +
                "}";



        Response response = RestAssuredFunctions.post("my/crocodiles/", accessToken, requestBody);
        System.out.println(response.body().asString());

    }

}
