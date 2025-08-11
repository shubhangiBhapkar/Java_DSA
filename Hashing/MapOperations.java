import java.util.*;
public class MapOperations {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();

        //put() - O(1)
        hm.put("India",100);
        hm.put("china",203);
        hm.put("USA",150);

        System.out.println(hm);

        //get() -O(1)
        System.out.println(hm.get("India")); //key exist
        System.out.println(hm.get("Indoneshia")); //not exist - null

        //containsKey() O(1)
        System.out.println(hm.containsKey("china"));
        System.out.println(hm.containsKey("Brazil"));

        //remove()
        System.out.println(hm.remove("china"));
        System.out.println(hm.remove("turkey"));

        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //clear
        hm.clear();
        System.out.println(hm);
        //isEmpty
        System.out.println(hm.isEmpty());
    }
}
