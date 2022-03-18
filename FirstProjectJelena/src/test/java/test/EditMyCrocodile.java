package test;

import common.RestAssuredFunctions;
import io.restassured.response.Response;

public class EditMyCrocodile {

    public static void main (String[] args) {
        String accessToken = GetTokenResponse.login("jatest86", "test123");

        String requestBody = "{\n" +
                "\"name\": \"MocoCroco\", \n" +
                "\"sex\": \"M\", \n" +
                "\"date_of_birth\":\"1995-01-01\" \n " +
                "}";


        Response response = RestAssuredFunctions.put("my/crocodiles/1582136/", accessToken, requestBody);
        System.out.println(response.body().asString());
    }
}

