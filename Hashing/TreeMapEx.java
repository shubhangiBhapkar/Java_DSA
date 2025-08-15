
import java.util.*;

public class TreeMapEx {
    public static void main(String[] args){
        TreeMap<String,Integer> tm = new TreeMap<>();
         tm.put("India",100);
         tm.put("china ", 150);
         tm.put("Nepal",20 );
         tm.put("a",220);

         HashMap<String,Integer>hm = new HashMap<>();
        hm.put("India",100);
        hm.put("china ", 150);
        hm.put("nepal",20 );
        hm.put("US",220);

         System.out.println(tm);
         System.out.println(hm);
    }
}
