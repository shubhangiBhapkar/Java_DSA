public class PowerOfX {
    //o(n)
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=n*xnm1;
        return xn;
    }
    //optimized Solution
    public static int OptimizedPower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfPower = OptimizedPower(a,n/2);
        int halfpowSq = halfPower * halfPower;

        //0dd
        if(n%2!=0){
            halfpowSq = a * halfpowSq;
        }
        return halfpowSq;
    }

    public static void main(String args[]){
        // System.out.println(power(2,5));
        System.out.println(OptimizedPower(2,5));
    }
}
