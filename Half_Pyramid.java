public class Half_Pyramid{
    public static void hlafInvPyramid(int n){
        for(int i=0;i<=n;i++){
            //loop for spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
                        }
           //loop for stars- no. of star equal to row no. means i
            for(int j=0;j<=i;j++){
            System.out.print("*");
            }
            System.out.println("");
        }
        
    }

    public static void main(String[] args) {
        hlafInvPyramid(7);
    }
}
