package Pattern;
public class FloydsTriangle {
    public static void floyds_triangle(int n){
        int counter=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String a[]){
        floyds_triangle(5);
    }
}
