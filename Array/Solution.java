import java.util.Arrays;

class Solution {
    public static int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = 0;
        boolean AllNegative = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                AllNegative=true;
            }
               cs = cs + nums[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
              
                 
        if (AllNegative == true) {
            int min = Arrays.stream(nums).min().getAsInt();
            return min;
        }
        }
        return ms;
    }

    public static void main(String a[]){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    
}
