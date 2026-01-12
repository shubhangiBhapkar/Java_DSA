public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int idx=0;
        for(int i=0,j=n;j<nums.length;j++,i++){
            arr[idx++] = nums[i];
            arr[idx++] = nums[j];
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = new int[]{2,5,1,3,4,7};
        shuffle(nums,3);
    }
}
