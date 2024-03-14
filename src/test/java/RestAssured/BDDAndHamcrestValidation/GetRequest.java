package RestAssured.BDDAndHamcrestValidation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetRequest {

    @Test
    public void GetBookingIds_VerifyStatusCode() {

        // Given
        given()
                .baseUri("https://restful-booker.herokuapp.com")
                // When
                .when()
                .get("/booking")
                // Then
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                // To verify booking count
                .body("bookingid", hasSize(10))
                // To verify booking id at index 3
                .body("bookingid[3]", equalTo(1));
    }

    @Test
    public void GetBookingIds_VerifyStatusCodeq() {

        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get("https://restful-booker.herokuapp.com/booking/1");
        ResponseBody responseBody = response.getBody();
        System.out.println(responseBody.asString());
    }
}
