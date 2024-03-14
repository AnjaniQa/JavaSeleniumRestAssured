package RestAssured.SerializationAndDeserialization.JsonArray;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class TestClass {

    @Test
    public void serialize() throws Exception {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id", 1);
        jsonObject1.put("name", "A");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id", 2);
        jsonObject2.put("name", "B");

        List<JSONObject> jsonObjects = new ArrayList();
        jsonObjects.add(jsonObject1);
        jsonObjects.add(jsonObject2);

        JSONArray jsonArray = new JSONArray(jsonObjects);
        System.out.println(jsonArray);

        ObjectMapper mp = new ObjectMapper();
        List<Employee> list = mp.readValue(jsonArray.toString(), new TypeReference<List<Employee>>(){});
        System.out.println(list);
    }

    @Test
    public void deSerialize() throws Exception {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("A");

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("B");

        Employee e3 = new Employee();
        e3.setId(3);
        e3.setName("C");

        Employee e4 = new Employee();
        e4.setId(3);
        e4.setName("D");

        List<Employee> employeeList = new ArrayList();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e3);

        ObjectMapper om = new ObjectMapper();
        String employeeListString = om.writeValueAsString(employeeList);
        System.out.println(employeeListString);

        JSONObject jsonObject;
        JSONArray jsonArray = new JSONArray(employeeListString);
        for (int i=0; i<jsonArray.length(); i++) {
            jsonObject = jsonArray.getJSONObject(i);
            System.out.println(jsonObject);
        }
    }
}
