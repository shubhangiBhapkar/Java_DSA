import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(8);
        set.add(1);
        System.out.println(set);;
    }
}
