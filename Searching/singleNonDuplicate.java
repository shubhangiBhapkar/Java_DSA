package Searching;

public class singleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int j =0;
        int i =1;
        while(i<nums.length){
            if(nums[i]==nums[j]){
                i = i+2;
                j = j+2;

            }else{
                break;
            }
        }
        return nums[j];
    }
}
