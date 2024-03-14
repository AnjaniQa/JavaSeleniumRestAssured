package RestAssured.ValueObject;

import org.json.JSONObject;

public class Booking {

    JSONObject jsonObject;

    Booking(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getFirstName() {
        return jsonObject.getString("firstname");
    }

    public String getLastName() {
        return jsonObject.getString("lastname");
    }

    public String getAdditionalNeeds() {
        return jsonObject.getString("additionalneeds");
    }

    public Integer getTotalPrice() {
        return jsonObject.getInt("totalprice");
    }

    public boolean getdepositpaid() {
        return jsonObject.getBoolean("depositpaid");
    }

    public BookingDates getBookingDates() {
        return BookingDates.createFromJson(jsonObject.getJSONObject("bookingdates"));
    }
}
