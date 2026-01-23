import java.util.*;

class Armstrong{
    public static void main(String[] args) {
       int num = 143;
       int originalNo=num;
       int sum=0;
       int digits = String.valueOf(num).length();

       while(num>0){
        int rem = num%10;
        sum+=Math.pow(rem,digits);
        num=num/10;
       }
       if(sum==originalNo){
        System.out.println(originalNo+" is an Armstrong number");
       }
       else{
        System.out.println(originalNo+" is not an Armstrong number");
       

    }
}}