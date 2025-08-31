public class SubArray{
    public static int getSubArray(int[] num,int length){
        int count=0;
        for(int i=0;i<length-2;i++){
            if(num[i] + num[i+2] == num[i+1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        int num[] = {1,2,1,3,5,2,4,2};
        int len = 8;
        System.out.println(getSubArray(num,len));
    }
}