public class Practice {
//     public static void Pair(int[] num){
//         for(int i=0;i<num.length;i++){
//             for(int j=i+1;j<num.length;j++){
//                 for(int k=i;k<j;k++){
//                     System.out.print(num[k] );
                  
//                 }
//              System.out.println();
//             }
//            System.out.println();
//         }
//     }

//MaxOfSubArray
public static int MaxOfPair(int[] num){
    int max = Integer.MIN_VALUE;
    
    for(int i=0;i<num.length;i++){
        for(int j=i+1;j<num.length;j++){
            int sum=0;
            for(int k=i;k<j;k++){
                sum = sum+num[k];

            }
            if(sum>max){
                    max = sum;
                }
        }
    }
    return max;
}
    public static void main(String args[]){
        int num[] = {2,4,6,8,10};
       System.out.println(MaxOfPair(num));
    }
}
