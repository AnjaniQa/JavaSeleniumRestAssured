package Java.Concepts.Association.Association;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestAssociation {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        m1.setMobileNumber(12);

        Mobile m2 = new Mobile();
        m2.setMobileNumber(16);

        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(m1);
        mobiles.add(m2);

        Person p = new Person();
        p.setName("Aman");
        p.setMobile(mobiles);

        System.out.println(p.getName());
        List<Mobile> mobile = p.getMobiles();
        Iterator<Mobile> itr = mobile.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().getMobileNumber());
        }

    }
}
