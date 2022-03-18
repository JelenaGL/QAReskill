package test;

import common.RestAssuredFunctions;
import io.restassured.response.Response;

public class GetSingleCrocodileId {

    public static void main(String[] args){

        String accessToken = GetTokenResponse.login("jatest86", "test123");

        String requestBody = "{\n" +
                "\"name\": \"Crocodile2\", \n" +
                "\"sex\": \"M\", \n" +
                "\"date_of_birth\":\"2001-01-01\" \n " +
                "}";



        Response response = RestAssuredFunctions.post("my/crocodiles/", accessToken, requestBody);
        System.out.println(response.body().asString());
        String responseAsString = response.body().asString();
        String id = responseAsString.substring(responseAsString.indexOf("id\":\"") +7, responseAsString.indexOf(",\"name\""));
        System.out.println(id);

        Response response2 = RestAssuredFunctions.get("my/crocodiles/" + id +"/", accessToken);
        System.out.println(response2.body().asString());
    }




}
