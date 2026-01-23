import java.util.*;
public class Solution {
    public static void main(String args[]){
        // Scanner sc =new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num%2==0){
        //     System.out.println(num+ "is even");
        // }else{
        //     System.out.println(num+"is odd");
        // }

        // for(int i=2;i<=num/2;i++){
        //     if(num%i==0){
        //         System.out.println(num+" is not a prime number");
                
        //     }else{
        //         System.out.println(num+" is a prime number");
        // }

        // Fabonacii
        // int number =6;
        // int first =0;
        // int second=1;
        // int next;
        // for(int i=0;i<number;i++){
        //     System.out.print(first + " ");
        //     next = first+second;
        //     first = second;
        //     second = next;
        // }
        
//4 Swap 
        // int a=5;
        // int b=10;
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println(a+" "+b);
// factorial
            // int factorial=1;
            // int num=5;
            // for(int i=1;i<=num;i++){
            //     factorial = factorial*1;
            // }
            // System.out.println(factorial);

// reverse a number
            // int num=1234;
            // int rev=0;
            // while(num>0){
            //     int rem = num % 10;
            //     rev = rev *10 +rem;
            //     num=num/10;
            // }
            // System.out.println(rev);


    // count digit in  no
    //     int number =0;
    //    int count =0;
    //    while(number>0){
    //     number=number/10;
    //     count++;
    //    }
    //    System.out.println(count);

// palindrome number
    // int num=120;
    // int original =num;
    // int rev =0;
    // while(num>0){
    //     int r=num%10;
    //     rev=rev*10+r;
    //     num=num/10;  
    // }
    // if(original==rev){
    //     System.out.println("palindrome");

    // }else{
    //     System.out.println("not palindrome");
    // }

// sum of digit of number
    int num=3245;
    int sum=0;

    while(num>0){
        int r=num%10;
        sum+=r;
        num=num/10;
    }
    System.out.println(sum);




    }
}
