package Java.Concepts.Association.Aggregation;

import java.util.List;

public class Institute {

    String iname;
    List<Department> departments;

    public Institute(String iname, List<Department> departments) {
        this.iname = iname;
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
