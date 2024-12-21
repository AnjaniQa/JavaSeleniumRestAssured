package Revision.RestAssured;

import org.json.JSONObject;

public class Book {

    JSONObject jsonObject;

    public Book(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getFirstName() {
        return jsonObject.getString("firstname");
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
