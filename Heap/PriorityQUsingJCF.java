package Heap;
import java.util.*;
public class PriorityQUsingJCF {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3); //O(logn)
        pq.add(6);
        pq.add(2);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());  //O(n)
            pq.remove();  //O(logn)
        }

     
    }
}
