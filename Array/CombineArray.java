public class CombineArray {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n*2];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i+n]=nums[i];
        }
        return ans;
    }
    public static void main(String args[]){
        CombineArray obj = new CombineArray();
        int nums[] = {1,2,3};
        int result[] = obj.getConcatenation(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
