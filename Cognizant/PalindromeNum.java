import java.util.*;
public class PalindromeNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        if(num==isPalindrome(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        
    }
    static int digit;
    static int reverse=0;
        
    public static int isPalindrome(int num){
        while(num>0){
            digit=num%10;
            num=num/10;
            reverse=reverse*10+digit;
        }
        return reverse;
    }
}
