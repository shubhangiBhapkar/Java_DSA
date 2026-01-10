import java.util.Arrays;
public class ArraySquare {
    public int[] sortedSquare(int nums[]){
        int arr[] = new int[nums.length];
        for(int i= 0;i<nums.length;i++){
            arr[i] = nums[i] * nums[i];
        }
        //Array.sort(arr);
        
        return arr;
    }
    public static void main(String args[]){
        ArraySquare obj = new ArraySquare();
        int nums[] = {-4,-1,0,3,10};
        int result[] = obj.sortedSquare(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
