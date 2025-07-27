public class CircularQ{
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;      
            
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //Add
        public static void Add(int data){
           if(isFull()){
            System.out.println("Queue is full");
            return;
           }
           //add 1st ele
           if(front == -1){
                front = 0;
           }
           rear = (rear+1) % size;
           arr[rear] = data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if(front == rear){
                rear = front =-1;
            }else{
                front = (front+1)%size;
            }
            return result;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is full");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]){
        Queue q= new Queue(3);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        System.out.println(q.remove());
        q.Add(4);
        System.out.println(q.remove());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}