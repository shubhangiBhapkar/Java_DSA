import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;

public class RemoveDuplicatesUsingSet {
    public static int[] removeDuplicates(int[] nums) {
        int expectedNums[]=new int[nums.length];
        Set <Integer> set= new LinkedHashSet<>();
        for(int num:nums){
            set.add(num);
        }  
        int i=0;
    for( int num:set){
        expectedNums[i]=num;
        i++;
    }
    System.out.println("length after duplicate removed "+i);
    return expectedNums;
    }
    public static void main (String[] args){
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
}


