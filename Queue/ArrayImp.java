public class ArrayImp{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

       public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        //isEmpty 
        public static boolean isEmpty() {
            return rear == -1;
        }  
        //Add
        public static void Add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
            }
            rear = rear+1;
            arr[rear] = data;
        }  

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<size-1;i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
            
        }

        //peek
        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(4);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        q.Add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}