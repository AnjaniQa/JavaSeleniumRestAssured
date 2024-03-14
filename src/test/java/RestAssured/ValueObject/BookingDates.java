package RestAssured.ValueObject;

import org.json.JSONObject;

public class BookingDates {

    JSONObject jsonObject;

    BookingDates(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getCheckIndate() {
        return jsonObject.getString("checkin");
    }

    public String getCheckOutDate() {
        return jsonObject.getString("checkout");
    }

    public static BookingDates createFromJson(JSONObject jsonObject) {
        return new BookingDates(jsonObject);
    }
}
