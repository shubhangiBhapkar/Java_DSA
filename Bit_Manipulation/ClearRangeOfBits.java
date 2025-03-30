public class ClearRangeOfBits {
    public static int clearBit(int n,int j,int i){
        int a= (~0)<<j+1;
        int b= (1<<i)-1;
        int bitMask=a|b;
        return n &bitMask;
    }
    public static void main(String args[]){
        System.out.println(clearBit(10,7,2));
    }
    
}
