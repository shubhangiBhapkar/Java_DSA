public class ZeroOneTriangle {
    public static void ZeroOne_Triangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String a[]){
        ZeroOne_Triangle(5);
    }
}
