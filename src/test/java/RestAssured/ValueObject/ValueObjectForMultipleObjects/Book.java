package RestAssured.ValueObject.ValueObjectForMultipleObjects;

import org.json.JSONObject;

public class Book {

    JSONObject jsonObject;

    Book(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public String getisbn() {
        return jsonObject.getString("isbn");
    }

    public String getWebsite() {
        return jsonObject.getString("website");
    }

    public String gettitle() {
        return jsonObject.getString("title");
    }

    public int getpages() {
        return jsonObject.getInt("pages");
    }

    public String getsubTitle() {
        return jsonObject.getString("subTitle");
    }

    public String getauthor() {
        return jsonObject.getString("author");
    }

    public String getpublisher() {
        return jsonObject.getString("publisher");
    }

    public String getdescription() {
        return jsonObject.getString("description");
    }

    public String getpublish_date() {
        return jsonObject.getString("publish_date");
    }

    public static Book createFromJson(JSONObject jsonObject) {
        return new Book(jsonObject);
    }
}
