package Interview;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

public class JsonClass {

    public static void main(String[] args) {
        RestAssured.baseURI = "";
        RequestSpecification requestSpecification = RestAssured.given();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Server1", "Cluster1");
        jsonObject.put("Server2", "Cluster2");
        jsonObject.put("Server3", "Cluster3");
        requestSpecification.body(jsonObject);
        Response response = requestSpecification

    }
}
