package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String args[]){
         ArrayList <Integer> list2 = new ArrayList<>();
    
        //Operations
        list2.add(6);
        list2.add(4);
        list2.add(3);
        list2.add(9);
        list2.add(5);

        System.out.println(list2);
        Collections.sort(list2);        //by default accending
        System.out.println(list2);
        Collections.sort(list2,Collections.reverseOrder());     //decending order ,comparitor is used to define function logic
    }
}
