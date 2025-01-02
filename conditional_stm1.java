import java.util.*;
class Positive_negative{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Number is Negative");
        }
        else if(num>0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}