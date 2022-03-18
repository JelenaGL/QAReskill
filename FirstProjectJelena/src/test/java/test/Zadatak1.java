package test;

import calls.CrocodilesAPI;
import data.models.LoginRequest;
import data.models.LoginResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Zadatak1 {

public static void main (String[] args) {

    RestAssured.baseURI = "https://test-api.k6.io/";
    LoginRequest loginRequest = new LoginRequest("jatest86", "test123");

    LoginResponse loginResponse = CrocodilesAPI.login(loginRequest);

    loginResponse.getAccess();

}
}
