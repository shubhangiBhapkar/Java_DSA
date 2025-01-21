public class subArray_Prefix {
    public static void printSubArray(int num[]){
        int currSum;
        int max=Integer.MIN_VALUE;
         int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + num[i];        }

        for(int i=0;i<num.length;i++){
                int start=i;
            for(int j=i+1;j<num.length;j++){
                int end=j;
               currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                
               if(max<currSum){
                max=currSum;
               }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] arg){
        int num[]={2,4,6,8,10};
        printSubArray(num);
    }
}
