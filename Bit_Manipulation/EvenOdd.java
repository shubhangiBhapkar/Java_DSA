public class EvenOdd {
    public static void getEvenOdd(int n){
        int Bitmask=1;
        if((n & Bitmask) ==0){
            System.out.println(n+ " is Even");
        }else{
            System.out.println(n+ " is Odd");
        }
    }
    public static void main(String args[]){
        getEvenOdd(3);
        getEvenOdd(10);
        
    }
}
