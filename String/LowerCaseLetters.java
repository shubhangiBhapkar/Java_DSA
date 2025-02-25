import java.util.*;
public class LowerCaseLetters {
    public static int getVowelsNo(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        System.out.println("The number of vowels in enter sentence :"+getVowelsNo(str));
    }
}
