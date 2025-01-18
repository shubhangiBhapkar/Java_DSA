public class Hollow_Recttangle{
    public static void hollowRectangle(int totRow,int totCol ){
        //outer loops
        for(int i=0;i<=totRow;i++){
            //ineer loop-columns
            for(int j=0;j<=totCol;j++){
                //check for border-conditions
                if(i==0||i==totRow||j==0||j==totCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String a[]){
        hollowRectangle(4,5);
    }
}