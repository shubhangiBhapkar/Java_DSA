public class NaturalNo {
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int snm1=Sum(n-1);
        int sn=n+snm1;
        return sn;
    }

    public static void PrintInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        PrintInc(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        System.out.println(Sum(5));
        PrintInc(5);
    }
}
