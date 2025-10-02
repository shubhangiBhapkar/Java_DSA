public class SubArrayCnt {
    
    public static int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            
                 if(2*(nums[i] + nums[i+2]) == nums[i+1]){
                    count++;
                }
            
        }
        return count;
    }

    public static void main(String args[]){
        int arr[]={1,2,1,4,1};
        System.out.print(countSubarrays(arr));

        
        
    }

}
