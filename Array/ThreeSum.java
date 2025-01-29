import java.util.Arrays;

public class ThreeSum{
    public static int[] getSum(int nums[]){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(i!=j && i!=k && j!=k){
                        if(nums[i]+nums[j]+nums[k]==0){
                            return new int[]{i,j,k};    
                        }
                    }
                }
            }
        }

        return new int[]{};

    }
    public static void main(String a[]){
        // int nums[]={-1,0,1,2,-1,-4};
        int nums[]={0,1,1};
        System.out.println(Arrays.toString(getSum(nums)));
    }
}