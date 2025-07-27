package ArrayList;
import java.util.*;
public class PairSum {

//*******Brute Force Approach*******
    // public static boolean getSum(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target)
    //                 return true;
    //         }
    //     }
    //     return false;
    // }


    // 2 Pointer Approach
    public static boolean getSum(ArrayList<Integer> list,int target){
        int Lp=0;
        int Rp=list.size()-1;
        while(Lp<Rp){
            //case 1
            if(list.get(Lp)+list.get(Rp)==target)
                return true;
            //case -2
            else if(list.get(Lp)+list.get(Rp)<target)
                Lp++;
            //case 3
            else 
                Rp--;
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        int target=11;
        System.out.println(getSum(list,target));
    }
}
