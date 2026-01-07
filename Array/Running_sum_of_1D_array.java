public class Running_sum_of_1D_array {
    public int [] runningSum(int nums[]){
        int i =0;
        int sum = 0;
        int j = 0;
        int res[] = new int[nums.length];

        while(i < nums.length){
            sum = nums[i]+sum;
            res[j] = sum;
            i++;
            j++;
        }
    return res;
    }
    public static void main(String args[]){
        Running_sum_of_1D_array obj = new Running_sum_of_1D_array();
        int nums[] = {1,2,3,4};
        int result[] = obj.runningSum(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
