import java.util.*;
public class IteratorSet {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();
     cities.add("India");
     cities.add("china");
     cities.add("US");
     cities.add("Nepal");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
