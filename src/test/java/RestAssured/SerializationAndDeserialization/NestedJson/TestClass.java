package RestAssured.SerializationAndDeserialization.NestedJson;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void serialize() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("firstname", "Aman");
        jsonObject.put("additionalneeds", "breakfast");

        JSONObject bookingsDateObject = new JSONObject();
        bookingsDateObject.put("checkin", "Jan 1");
        bookingsDateObject.put("checkout", "jan 2");
        jsonObject.put("bookingdates", bookingsDateObject);

        jsonObject.put("totalprice", 100);
        jsonObject.put("depositpaid", true);
        jsonObject.put("lastname", "Kumar");

        System.out.println(jsonObject);

        String bookingString = jsonObject.toString();


        ObjectMapper om = new ObjectMapper();
        Booking booking = om.readValue(bookingString, Booking.class);

        System.out.println(booking.getFirstname());
        System.out.println(booking.getAdditionalneeds());

        BookingDates bookingDates = booking.getBookingdates();
        System.out.println(bookingDates.getCheckin());
        System.out.println(bookingDates.getCheckout());

        System.out.println(booking.getTotalprice());
        System.out.println(booking.isDepositpaid());
        System.out.println(booking.getLastname());
    }

    @Test
    public void deserialize() throws Exception {
        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("Jan 1");
        bookingDates.setCheckout("Jan 2");
        Booking booking = new Booking();
        booking.setFirstname("Aman");
        booking.setAdditionalneeds("Breakfast");
        booking.setBookingdates(bookingDates);
        booking.setTotalprice(100);
        booking.setDepositpaid(true);
        booking.setLastname("Kumar");

        ObjectMapper objectMapper = new ObjectMapper();
        String bookingString = objectMapper.writeValueAsString(booking);
        JSONObject jsonObject = new JSONObject(bookingString);
        System.out.println(jsonObject);
    }
}
