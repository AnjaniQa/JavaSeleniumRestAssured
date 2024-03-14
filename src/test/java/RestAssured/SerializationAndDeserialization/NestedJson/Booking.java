package RestAssured.SerializationAndDeserialization.NestedJson;

import java.util.*;

/**
 *     {
 *         "firstname": "James",
 *         "additionalneeds": "Breakfast",
 *         "bookingdates": {
 *                "checkin": "2018-01-01",
 *                "checkout": "2019-01-01"
 *          },
 *         "totalprice": 111,
 *         "depositpaid": true,
 *         "lastname": "Brown"
 *     }
 */

public class Booking {

    String firstname;
    String additionalneeds;
    BookingDates bookingdates;
    int totalprice;
    boolean depositpaid;
    String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
