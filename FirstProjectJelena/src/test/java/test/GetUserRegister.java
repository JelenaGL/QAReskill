package test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetUserRegister {

    public static void register(String userName, String firstName, String lastName, String email, String pass) {

        RestAssured.baseURI = "https://test-api.k6.io/";


        String requestBody = "{\n" +
                "\"username\": \"jatest86\", \n" +
                "\"first_name\": \"Jelena\", \n" +
                "\"last_name\": \"Grubor Lugonja\", \n" +
                "\"email\": \"nekiemail86@gmail.com\", \n" +
                "\"password\": \"test123\" \n " +
                "}";


        Response response = RestAssured.given().contentType(ContentType.JSON).body(requestBody).post("user/register/").then().extract().response();
        System.out.println(response.body().asString());
    }
}