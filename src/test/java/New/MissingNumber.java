package New;

import java.util.ArrayList;

public class MissingNumber {

    public static void main(String[] args) {


        // {1,3,5,4,6}

        int a[] = {1,2,7,5,4,6};

        int len = a.length;

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<len; i++) {

            al.add(a[i]);

        }

        int find = 1;

        for(int j=0; j<al.size(); j++) {

            if(al.contains(find)) {
                find ++;
                continue;
            } else {
                break;
            }
        }

        System.out.println("Missing number is " + find);

    }
}
