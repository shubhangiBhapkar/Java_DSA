public class Clear_Last_iBits {
    public static int ClearLstBits(int n,int i){
        int bitMask= (~0)<<i ;
        return (n & bitMask);
    }
    public static void main(String[] args){
        System.out.println(ClearLstBits(0b1111,2));
    }
}
