public class UpdateBit {
    public static int clearBit(int n,int i){
       return (n & ~(1 << i));
    }
    public static int setBit(int n,int i){
        return (n | (1<<i));
    }
    public static int GetUpdateBit(int n,int i,int newBit){
        if(newBit==0){
            return clearBit(n,i);
        }
        else{
            return setBit(n,i);
        }
    }
    public static void main(String args[]){
        System.out.println(GetUpdateBit(10,1,0));
    }
    
}
