import java.util.*;

public class factorial {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;

        }
        System.out.println("Factorial is :"+fact);
        }
        
    }

