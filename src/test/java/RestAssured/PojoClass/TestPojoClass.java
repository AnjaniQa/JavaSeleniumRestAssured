package RestAssured.PojoClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestPojoClass {

    @Test
    public void testGetRequest() throws Exception {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking/1";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        ResponseBody responseBody = response.getBody();
        String responseString = responseBody.asString();
        ObjectMapper mp = new ObjectMapper();
        Booking b = mp.readValue(responseString, Booking.class);
        Bookingdates bd = b.getBookingdates();
        System.out.println(b.getFirstname());
        System.out.println(b.getLastname());
        System.out.println(b.getAdditionalneeds());
        System.out.println(b.getTotalprice());
        System.out.println(bd.getCheckin());
        System.out.println(bd.getCheckout());

        String s = mp.writeValueAsString(b);
        JSONObject jsonObject = new JSONObject(s);
        System.out.println(jsonObject);
    }
}
