package RestAssured.MakeSeleniumEasy;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class GetRequest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking/1";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();

        // Status line
        String statusLine = response.getStatusLine();
        System.out.println(statusLine);

        // Status code
        System.out.println(response.getStatusCode());
        int statusCode = response.getStatusCode();

        // Using Junit
        // assertEquals(statusCode, 200);

        // Using TestNG
        // Assert.assertEquals(statusCode, 200);

        // Converting response to string
        String responseString = response.asString();
        System.out.println(responseString);
        //Assert.assertTrue(responseString.contains("200"));

        //ResponseBody
        ResponseBody responseBody = response.getBody();
        ResponseBody responseBody1 = response.body();
        String responseBodyString = responseBody.asString();
        System.out.println(responseBodyString);
        System.out.println(responseBody1.asString());

        JSONObject jsonObject = new JSONObject(responseBody.asString());

        String f = jsonObject.getString("firstname");

        JSONObject bookingDateJson = jsonObject.getJSONObject("bookingdates");

        String checkIn = bookingDateJson.getString("checkin");



        /*

        {
  "firstname": "Jim",
  "additionalneeds": "Breakfast",
  "bookingdates": {
    "checkin": "2020-11-05",
    "checkout": "2022-06-26"
  },
  "totalprice": 678,
  "depositpaid": true,
  "lastname": "Wilson"
}
         */



        System.out.println(f);



    }

    @Test
    public void testGetUsingBDD() {

        ValidatableResponse validatableResponse = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/booking/1")
                .when()
                .get()
                .then()
                .assertThat()
                .statusCode(200);

        Response response = RestAssured.given().baseUri("https://restful-booker.herokuapp.com/booking/1").get();
        response.prettyPrint();
        
        validatableResponse = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .when()
                .get("/booking/1")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body("firstname", equalTo("James"))
                .body("lastname", equalTo("Brown"));
    }

    @Test
    public void testGetRequestAndObjectMapping() throws Exception {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking/1";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        ResponseBody responseBody = response.getBody();
        String responseString = responseBody.asString();
        ObjectMapper om = new ObjectMapper();
        Booking b = om.readValue(responseString, Booking.class);
        System.out.println(b.getFirstname());
        System.out.println(b.getLastname());
        System.out.println(b.getAdditionalneeds());
        System.out.println(b.getTotalprice());
        Bookingdates bd = b.getBookingdates();
        System.out.println(bd.getCheckin());
        System.out.println(bd.getCheckin());
    }


    private String getFirstname(JSONObject jsonObject) {
        return jsonObject.getString("firstname");
    }
}

