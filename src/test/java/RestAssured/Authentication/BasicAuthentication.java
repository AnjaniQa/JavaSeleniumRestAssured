package RestAssured.Authentication;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthentication {

    @Test
    public void testBasicAuthentication() {
        RequestSpecification request = RestAssured.given().auth().basic("postman", "password");
        Response response = request.get("https://postman-echo.com/basic-auth");
        System.out.println(response.getStatusLine());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
