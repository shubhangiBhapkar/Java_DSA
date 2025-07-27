public class DigitToString {

    static String digit[]={"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    public static void printDigit(int number){
        if(number==0){
            return ;
        }

        int LastDigit = number%10;
        printDigit(number/10);
        System.out.print(digit[LastDigit]);
        
    }
    public static void main(String[] args){
        printDigit(1234);

    }
}
