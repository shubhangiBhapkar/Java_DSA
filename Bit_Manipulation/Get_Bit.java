public class Get_Bit {
    public static void getBit(int n,int i){
        if((n &(1<<i))==0){
            System.out.println(i+ " ith elemnet is 0");
        }else{
            System.out.println(i+ " ith elemnet is 1");
        }
    }
    public static void main(String args[]){
       getBit(00001111,3);
    }
}

