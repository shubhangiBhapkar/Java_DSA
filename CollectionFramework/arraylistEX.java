import java.util.*;
public class arraylistEX {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<> ();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
       
        list.add(90);
        list.add(100);

        System.out.print(list);
        list.add(7,80);
        System.out.println();
        System.out.print(list);

        //get
        System.out.println(list.get(5));

        list.set(1,1000);
        System.out.println(list.contains(1000));

        //remove
        list.remove(1);
        System.out.println(Integer.valueOf(30));
        System.out.println(list);

        //iterator
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));        
         }   
         
         for(Integer ele:list){
            System.out.println(ele); 
         }

         Iterator<Integer> it=list.iterator();
         while(it.hasNext()){
            System.out.println("Iterator "+it.next());
         }
    }

}
