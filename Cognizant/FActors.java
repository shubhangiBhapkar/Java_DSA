import java.util.*;
public class FActors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=Math.abs(sc.nextInt());
        if(n==0){
            System.out.println("No Factors");
        }
       
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
    }
}
