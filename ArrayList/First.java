package ArrayList;
import java.util.ArrayList;     //ArrayList class

public class First {
    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();
    
        //Operations
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        
        System.out.println(list.get(4));      //get give index

        list.remove(4);                     //ive index O(n)
        System.out.println(list);

        list.set(1,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(5));

        list.add(2,20);
        System.out.println(list);

    //size()
    System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

    }
   

}
