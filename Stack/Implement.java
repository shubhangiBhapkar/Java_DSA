import java.util.ArrayList;

public class Implement {
    public static class Stack{
       static ArrayList<Integer> list = new ArrayList<>();
        public  boolean isEmpty(){
            return list.size() == 0;
        }
    
        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        //peek
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    
}
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
           
        }

    }
}
