import java.util.*;

public class LinkedListImple {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this .data = data;
            this.next = null;
        }
    }
    public static class Stack{
        public static Node head = null;
        
        //isEmpty
        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        //push
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }

        
    }
public static void main(String args[]){

        //java collecction framework
        // Stack<Integer> s = new Stack<>();
            Stack s = new Stack();
            s.push(3);
            s.push(2);
            s.push(1);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
}
