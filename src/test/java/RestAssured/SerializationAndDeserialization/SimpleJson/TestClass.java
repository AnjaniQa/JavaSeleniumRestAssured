package RestAssured.SerializationAndDeserialization.SimpleJson;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void serialize() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        jsonObject.put("name", "Aman");
        String studentString = jsonObject.toString();
        ObjectMapper mp = new ObjectMapper();
        Student student = mp.readValue(studentString, Student.class);
        System.out.println("Id : " + student.getId());
        System.out.println("Name : " + student.getName());
    }

    @Test
    public void deSerialize() throws Exception {

        Student s = new Student();
        s.setId(1);
        s.setName("A");

        ObjectMapper om = new ObjectMapper();
        String studentString = om.writeValueAsString(s);
        System.out.println(studentString);
        System.out.println();
        JSONObject jsonObject = new JSONObject(studentString);
        System.out.println(jsonObject);
        System.out.println();

        String studentPrettyString = om.writerWithDefaultPrettyPrinter().writeValueAsString(s);
        System.out.println(studentPrettyString);
        System.out.println();
        jsonObject = new JSONObject(studentPrettyString);
        System.out.println(jsonObject);
        System.out.println();
    }

}
