public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data); 
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        
        
    }

    public void addlast(int data){
        Node newNode = new Node(data); 
        size++;
        if(head == null){
            head = tail = newNode;
        }
            tail.next = newNode;
            newNode.prev = tail;
            newNode = tail;

    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove
    public int removeFirst(){
        if(head == null ){
            System.out.println("linkedList is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val =  head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void reverse(){
        if(head == null || head.next == null){
            
        }
        Node curr = head;
        Node prev = null ;
        Node next;
        while(head != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public static void main(String args[]){
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.addFirst(2);
        dd.addFirst(1);
        dd.addlast(3);
        dd.print();
        dd.removeFirst();
        dd.print();

        dd.reverse();
        dd.print();
    }
}
