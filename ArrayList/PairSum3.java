package ArrayList;
import java.util.ArrayList;
public class PairSum3 {
    public static boolean getSum(ArrayList<Integer> list,int target){
        int bp=-1;
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int Lp=bp+1;
        int Rp=bp;

        while(Lp!=Rp){
            if (list.get(Lp)+list.get(Rp)==target) 
                return true;

            if(list.get(Lp)+list.get(Rp)<target)
            {
                Lp=(Lp+1)%n;
            }else{
                Rp=(n+Rp-1)%n;
            }
                
           
        }
         return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);list.add(15);list.add(6);list.add(8);list.add(9);
        int target=16;
        System.out.println(getSum(list,target));
    }
}
