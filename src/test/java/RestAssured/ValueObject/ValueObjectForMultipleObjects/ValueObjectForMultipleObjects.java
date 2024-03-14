package RestAssured.ValueObject.ValueObjectForMultipleObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class ValueObjectForMultipleObjects {

    @Test
    public void testGetRequestForMultipleObjects() throws Exception {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        ResponseBody responseBody = response.getBody();
        JSONObject jsonObject = new JSONObject(responseBody.asString());
        JSONArray jsonArray = jsonObject.getJSONArray("books");
        List<Book> booksList = new ArrayList<>();
        for(int i=0; i<jsonArray.length(); i++) {
            JSONObject jo = jsonArray.getJSONObject(i);
            Book b = Book.createFromJson(jo);
            booksList.add(b);
        }
        for(Book book : booksList) {
            System.out.println(book.getisbn());
            System.out.println(book.getpages());
            System.out.println(book.getauthor());
            System.out.println(book.getpublisher());
            System.out.println(book.gettitle());
            System.out.println(book.getsubTitle());
            System.out.println(book.getWebsite());
            System.out.println(book.getpublish_date());
            System.out.println();
        }
    }


}
