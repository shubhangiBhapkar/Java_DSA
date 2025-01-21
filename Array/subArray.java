public class subArray {
   
    public static void printSubArray(int num[]){   
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=num.length;i++){
            for(int j=i+1;j<=num.length;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    System.out.print(num[k]+" ");
                    sum+=num[k];
                    
                    
                }     
                if(sum>max){
                    max=sum;
                }       
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("maximum sum is"+ max);
    }
    public static void main(String[] arg){
        int num[]={2,4,6,8,10};
        printSubArray(num);
  
    }
}
