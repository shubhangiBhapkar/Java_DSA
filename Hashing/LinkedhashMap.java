import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedhashMap {
    public static void main (String args[]){
         LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();  //oredred
         lhm.put("India",100);
         lhm.put("china ", 150);
         lhm.put("nepal",20 );
         lhm.put("US",220);
         System.out.println(lhm);

         HashMap<String,Integer> hm = new HashMap<>(); //unordered
         hm.put("India",100);
         hm.put("china ", 150);
         hm.put("nepal",20 );
         hm.put("US",220);
        System.out.println(hm);

    }
}
