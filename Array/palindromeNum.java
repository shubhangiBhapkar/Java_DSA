public class palindromeNum {
    public static boolean getPalindrome(int x){
        int reverseNum=0;
        int num=0;
        while(x>0){
            num= x % 10;
            reverseNum = reverseNum * 10 + num;
            x/=10;
        }
        return x ==reverseNum;
    }
    public static void main(String arg[]){
        int x=121;
        System.out.println(getPalindrome(x));
    }
}
        
    

