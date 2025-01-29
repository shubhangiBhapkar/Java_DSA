public class RemoveDuplicate {
    public static int removeduplicate(int nums[]){
        // int nums[]={0,0,1,1,1,2,2,3,3,4};

        int uniqueIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[uniqueIndex]!=nums[i]){
                uniqueIndex++;
            nums[uniqueIndex]=nums[i];            }
        }
        return uniqueIndex+1;
    }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int expectedNums[]={0,1,2,3,4};

        //calling function
        int k=removeduplicate(nums);

        // Assertion
        assert k == expectedNums.length : "Length Mismatched";

        for(int i=0;i<k;i++){
           assert nums[i]==expectedNums[i] : "element mismatch at index "+i;
        }
        
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
