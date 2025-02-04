import java.util.Arrays;
//if sorted array [1,2,3,4,5] then time complexity should be less 
// so we will take swap var and inc it ater each swapping after 1 turn its value not incremented the array is already sorted.

public class BubbleSort {
    public static int[] getSortedArray(int[] nums){
        for(int turn=0;turn<nums.length-1;turn++){
            int swap=0;
            for(int j=0;j<nums.length-1-turn;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                return nums;
            }
        }
        return nums;
    }
    public static void main(String[] args){
         int nums[]={3,4,2,5,1};
        // int nums[]={1,2,3,4,5};
        System.out.println(Arrays.toString(getSortedArray(nums)));
    }
}
