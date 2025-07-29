import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {
    public static Queue<Integer> getFirstReverseK(Queue<Integer> q, int k) {
      
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        // if size is less than k
        if(size < k) {
            return q;
        }
        //remove first k ele and addinto stack
        for(int i= 0;i<k ;i++) {
            s.push(q.remove());
        }
        //remove ele from stack add to q
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        //add fist ele of q to last
        for(int i=0;i<size-k;i++){
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String args[]){

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print(getFirstReverseK(q,3));
    }
}
