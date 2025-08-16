import java.util.*;
public class DistinctEle {
    public static void main(String[] args){
        int arr [] ={4,3,2,5,6,7,2,3,1};
        HashSet<Integer> set = new HashSet<>();

        for(Integer num : arr){
            set.add(num);
        }
        System.out.println("ans = "+set.size());
    }
}
