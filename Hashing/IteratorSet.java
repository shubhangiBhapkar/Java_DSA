import java.util.*;
public class IteratorSet {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("china");
        set.add("US");
        set.add("Nepal");

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
