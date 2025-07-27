package ArrayList;
import java.util.ArrayList;
public class Swap1 {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

        System.out.println(list);
    }
    public static void main(String args[]){
      ArrayList<Integer> var1 = new ArrayList<>();
     
      var1.add(2);
      var1.add(5);
      var1.add(9);
      var1.add(3);
      var1.add(6);

       int idx1=1;
       int idx=3;

       System.out.println(var1);
       swap(var1,idx1,idx);
    }

}
