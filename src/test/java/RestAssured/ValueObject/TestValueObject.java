package RestAssured.ValueObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestValueObject {

    @Test
    public void testGetRequest() throws Exception {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking/1";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        ResponseBody responseBody = response.getBody();
        String responseString = responseBody.asString();
        JSONObject jsonObject = new JSONObject(responseString);
        Booking b = new Booking(jsonObject);
        System.out.println(b.getFirstName());
        System.out.println(b.getLastName());
        System.out.println(b.getAdditionalNeeds());
        System.out.println(b.getdepositpaid());
        System.out.println(b.getTotalPrice());
        BookingDates bd = b.getBookingDates();
        System.out.println(bd.getCheckIndate());
        System.out.println(bd.getCheckOutDate());
    }
}
