package ArrayList;
import java.util.ArrayList;

public class reverse {
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int len=list.size();
        for(int i=len-1;i>=0;i--){
            System.out.println(list.get(i)+" ");
        }
    }
}
