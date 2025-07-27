import java.util.*;
public class CarNO {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 4 digit number:");
        int num=sc.nextInt();
        int digit;
        int sum=0;
        if(num <0 || num <999 ||num >9999){
            System.out.println("Invalid number");
            return;
        }
        while(num>0){
            digit=num%10;
            num=num/10;
            sum=sum+digit;
        }
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
	   {
	        System.out.println ("Lucky Number");
	   }
	   else
	   {
	        System.out.println ("Sorry its not my lucky number");
	   }
    }
}
