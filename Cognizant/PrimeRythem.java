import java.util.*;
public class PrimeRythem {

    public static void main(String[] args){
        boolean flag= false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        if(a<=0 ||b<=0 || a>=b || b-a<=0){
            System.out.println("Invalid inputs");
            return;
        }
        int num=a;
        while(num<=b){
            if(isPrime(num)){
                System.out.print(num+" ");
            }
            num++;
        }
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    
    
   
}

