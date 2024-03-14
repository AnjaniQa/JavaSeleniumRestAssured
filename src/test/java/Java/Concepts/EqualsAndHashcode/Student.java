package Java.Concepts.EqualsAndHashcode;

import java.util.Objects;

public class Student {

    int id;
    String name;


    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        } else if (o==null || o.getClass()!=this.getClass()) {
            return false;
        }

        Student s = (Student) o;

        return(s.id == this.id && s.name == this.name);
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
