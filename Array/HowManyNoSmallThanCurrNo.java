class howManyNoSmallThanCurrNo{
    public static int[] howManyNoSmallThanCurrNo(int[] nums) {
        int arr[] = new int[nums.length];
        int i=0;

        while(i<nums.length){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            arr[i]=count;
            i++;
        }
        return arr;
    }
    public static void main(String args[]){
        int nums[]={8,1,2,2,3};
        howManyNoSmallThanCurrNo(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(howManyNoSmallThanCurrNo(nums)[i]+" ");
        }
    }
}