import java.util.*;
public class evenOddSum {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        int choice;
        do{
            System.out.println("Enter a number");
            int num=sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
            System.out.println("Enter 1 for continue 0 for exit :");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("sum of even numbers is:"+evenSum);
        System.out.println("sum of odd numbers is :"+oddSum);

    }
}
