package Java.Concepts.Association.Association;

import java.util.List;

public class Person {

    String name;
    List<Mobile> mobiles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(List<Mobile> mobile) {
        this.mobiles = mobile;
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }
}
