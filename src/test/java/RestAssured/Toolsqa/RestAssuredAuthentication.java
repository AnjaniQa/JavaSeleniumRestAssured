package RestAssured.Toolsqa;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredAuthentication {

    @Test
    public void testBasicAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given().auth().basic("postman", "password");
        Response response = request.get();
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(200, response.getStatusCode());

        //Negative scenario 1
        request = RestAssured.given().auth().basic("postman", "passwor");
        response = request.get();

        statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(401, response.getStatusCode());

        //Negative scenario 2
        RestAssured.baseURI = "https://postman-echo.com/basic-aut";
        request = RestAssured.given().auth().basic("postman", "password");
        response = request.get();
        statusCode = response.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(404, response.getStatusCode());
        Assert.assertFalse(response.asString().contains("200"));
        Assert.assertTrue(response.asString().contains("404"));
    }


    @Test
    public void testPreemptiveAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given().auth().preemptive().basic("postman", "password");
        Response response = request.get();
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testDigestiveAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given().auth().digest("postman", "password");
        Response response = request.get();
        response = request.get();
        Assert.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testFormAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given().auth().form("postman", "password");
    }

    @Test
    public void testOAuthAuthentication() {
        RestAssured.baseURI = "https://postman-echo.com/basic-auth";
        RequestSpecification request = RestAssured.given().auth().oauth("consumerKey" , "consumerSecret", "accessToken", "tokenSecret");
        request = RestAssured.given().auth().oauth2("token");
    }
}
