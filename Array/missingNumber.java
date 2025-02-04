import java.util.Arrays;

public class missingNumber {
    public static int getMissingNo(int nums[]){
         Arrays.sort(nums);
         
    //   for(int i=0;i<n;i++){
    //     if(i != nums[i]){
    //         return i;
    //     }
    //   }
    //     return n;

        int n=nums.length;
        int sum=(n*(n+1)/2);
        for(int num:nums){
            sum-=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={9,2,5,3,6,4,7,1,0};
        System.out.println(getMissingNo(nums));
    }
}
