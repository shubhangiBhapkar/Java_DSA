package ArrayList;
import java.util.ArrayList;

public class TwoD {
    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

        ArrayList<Integer> list1 =new ArrayList<>();
        list1.add(2);list1.add(4);

        ArrayList<Integer> list2 =new ArrayList<>();
        list2.add(3);list2.add(6);

        mainList.add(list1); mainList.add(list2);
        //display
        for(int i=0;i<mainList.size();i++){

            ArrayList <Integer> currentList=mainList.get(i);
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
