package RestAssured.Qaautomation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TestGetRequest {

    RequestSpecification requestSpecification;
    Response response;

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
        requestSpecification = RestAssured.given();
        response = requestSpecification.get();
        response.prettyPrint();
    }
}
