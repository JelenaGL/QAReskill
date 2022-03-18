package test;

import common.RestAssuredFunctions;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleUser {

    public static void main (String[]args) {
        RestAssured.baseURI = "https://test-api.k6.io/";

        Response response = RestAssuredFunctions.get("public/crocodiles/2/");
        System.out.println(response.body().asString());
    }
}
