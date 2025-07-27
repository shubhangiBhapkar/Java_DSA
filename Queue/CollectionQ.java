import java.util.*;
public class CollectionQ {
    public static void main(String[] args){
        //Queue<Integer> q = new LinkedList<>(); //Queue is inteface so need to create LinkedList 
        Queue<Integer> q = new ArrayDeque<>();                                       //Or ArrayDeque object
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
