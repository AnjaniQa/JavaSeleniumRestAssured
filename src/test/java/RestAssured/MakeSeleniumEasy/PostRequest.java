package RestAssured.MakeSeleniumEasy;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Test;

public class PostRequest {

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/auth";
        RequestSpecification request = RestAssured.given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
        jsonObject.put("password", "password123");
        request.header("Content-Type", "application/json");
        request.body(jsonObject);
        Response response = request.post();
        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }

    @Test
    public void testPostRequestUsingBDD() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
        jsonObject.put("password", "password123");
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .contentType(ContentType.JSON)
                .body(jsonObject)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("token", Matchers.notNullValue())
                .body("token.length()", Matchers.is(15))
                .body("token", Matchers.matchesRegex("^[a-zA-Z]+$"));
    }
}
