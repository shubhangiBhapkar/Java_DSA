import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("No factors");
            return ;
        }
        int n=Math.abs(num);
        System.out.println(fact(n));
        
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
}
