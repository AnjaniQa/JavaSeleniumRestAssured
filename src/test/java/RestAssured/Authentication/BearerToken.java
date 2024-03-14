package RestAssured.Authentication;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BearerToken {

    String token = null;

    @Test
    public void getAccessToken() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("mobile", "2022014667");
        jsonObject.put("otp", "2432");
        request.body(jsonObject);
        Response response = request.post("https://api.phedmanipur.com/api/v1/user/validateOtp");
        System.out.println(response.getStatusLine());
        token = response.body().jsonPath().getString("data.accessToken");
        System.out.println(token);
    }

    @Test
    public void getUserProfileData() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Authorization", "Bearer " + token);
        Response response = request.post("https://api.phedmanipur.com/api/v1/user/getUserProfileData");
        System.out.println(response.getStatusLine());
        Assert.assertEquals(response.statusCode(), 200);
        Assert.assertEquals(response.body().jsonPath().getString("message"), "Data retrieved successfully");
        response.prettyPrint();
    }
}
