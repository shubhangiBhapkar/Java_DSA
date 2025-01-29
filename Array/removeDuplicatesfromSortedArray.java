import java.util.Arrays;
import java.util.HashSet;
public class removeDuplicatesfromSortedArray {
    public static int removeDuplicates(int nums[]){
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k]){
                
                

            }
        }

        return k;

    }
    public static void main(String arg[]){
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        // System.out.println(Arrays.toString(removeDuplicates(nums)));
        System.out.println(removeDuplicates(nums));
    }
}
