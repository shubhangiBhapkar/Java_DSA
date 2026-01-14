public class RepeatNumber {
    public int[] findErrorNums(int[] nums) {
       int left=0;
       int arr[] = new int[2];
       for(int right=1;right<=2;right++){
        if(nums[left]==nums[right]){
            arr[0]=nums[left];
            arr[1]=nums[left]+1;
            return arr;
        }else{
            
            left++;
        }
       }
       return arr;
    }
}
