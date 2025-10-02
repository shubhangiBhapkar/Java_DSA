public class ZeroToEnd {
    public static void moveZeroes(int nums[]){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        for(int n :nums){
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        int nums[]={0,1,3,0,12};
        moveZeroes(nums);
    }
}
