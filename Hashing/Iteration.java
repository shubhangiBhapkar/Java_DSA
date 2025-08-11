import java.util.*;
public class Iteration {
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
         hm.put("India",100);
        hm.put("china",203);
        hm.put("USA",150);
        hm.put("Indonesia",2150);
        hm.put("Nepal",300);

        Set<String> key = hm.keySet();
        for (String k : key) {
            System.out.println("key ="+k+ " value ="+hm.get(k));
        }

      

    }
}
