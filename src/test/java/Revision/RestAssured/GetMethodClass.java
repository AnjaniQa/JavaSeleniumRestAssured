package Revision.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;
import io.restassured.response.ResponseBody;

public class GetMethodClass {

    @Test
    public void getRequest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking/1";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        System.out.println(response.getStatusLine());
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
        ResponseBody responseBody = response.getBody();
        //System.out.println(responseBody.prettyPrint());
        JSONObject jsonObject = new JSONObject(responseBody.asString());
        Book book = new Book(jsonObject);
        String fn = book.getFirstName();
        System.out.println(fn);

    }

    /*
    {
    "firstname": "Mary",
    "lastname": "Jackson",
    "totalprice": 775,
    "depositpaid": false,
    "bookingdates": {
        "checkin": "2019-07-22",
        "checkout": "2020-09-05"
    },
    "additionalneeds": "Breakfast"
}
     */
}
