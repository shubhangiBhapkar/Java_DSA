
import java.util.LinkedList;
import java.util.Deque;
public class DequeSimple {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
            deque.addFirst(1);
            deque.addFirst(2);
            System.out.println(deque);
            deque.removeFirst();

            deque.addLast(3);
            deque.addLast(4);
            System.out.println(deque);
            deque.removeLast();
            System.out.println(deque);

            System.out.println("get first " + deque.getFirst());
            System.out.println("get Last " + deque.getLast());

        
    }
}
