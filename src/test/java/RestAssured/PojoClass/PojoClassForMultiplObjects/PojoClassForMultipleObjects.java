package RestAssured.PojoClass.PojoClassForMultiplObjects;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.List;

public class PojoClassForMultipleObjects {

    @Test
    public void testGetRequestForMultipleObjects() throws Exception {
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification request = RestAssured.given();
        Response response = request.get();
        ResponseBody responseBody = response.getBody();
        JSONObject jsonObject = new JSONObject(responseBody.asString());
        JSONArray jsonArray = jsonObject.getJSONArray("books");
        ObjectMapper mp = new ObjectMapper();
        String responseString = jsonArray.toString();
        List<Books> booksList = mp.readValue(responseString, new TypeReference<List<Books>>(){});
        for (Books book : booksList) {
            System.out.println(book.isbn);
            System.out.println(book.title);
        }
    }
}
