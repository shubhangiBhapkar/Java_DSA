public class PairOfArrayEle {
    public static void makePair(int num[]){
        for(int i=0;i<=num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("{ "+num[i] +""+num[j]+ "}");
            }     
            System.out.println();     
        }
    }
    public static void main(String a[]){
        int num[]={2,4,6,8,5};
        makePair(num);
    }
}
