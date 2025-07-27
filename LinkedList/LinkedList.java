public  class LinkedList{
    public static class Node{
        int data;
        Node next;

        //Constructor to initialize 
       public Node(int data){
           this.data=data;
           this.next=null;
        }
    } 
        public static Node head;
        public static Node tail;
        int size;

        public void addFirst(int data){
            //step-1 create new node
            Node newNode = new Node(data); 
            size++;
            if(head == null){
                    head = tail = newNode;
                    return;
            }
        
            //step-2 newNode next = head
            newNode.next = head;

            //step-3 head = new Node
            head = newNode;
        }

        public void addLast(int data){
            // 1. create newNodw
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail = newNode;
            }

            //2. link
            tail.next = newNode;

            //3. newNode = tail
            tail = newNode;
        }

        //add in middle
        public void add(int idx,int data){
            if(idx == 0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;

            while(i < idx-1){
                temp = temp.next;
                i++;

            }
            newNode.next=temp.next;
            temp.next = newNode;
        }

        public int removeFirst(){
            if(size == 0){
                System.out.println("Linked List is empyt");
                return Integer.MIN_VALUE;

            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }

            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    
        public int removeLast(){
            if(size == 0){
                System.out.println("empty");
                return Integer.MAX_VALUE;

            }else if(size == 1){
                int val = head.data;
                head = tail =null;
                size = 0;
                return val;
            }
            //prev =size-2
            Node prev = head;
            for(int i=0; i<size-2;i++){
                prev = prev.next;
            }
            //remove last
            int val =prev.next.data; //tail data;
            prev.next =null;
            tail =prev;
            size --;
            return val;
        }


        //Iterative Search
        public int itrSearch(int key){
            Node temp = head;
            int idx=0;
            while(temp != null){
                if(temp.data == key){ //key found
                    return idx;
                }
                temp =temp.next;
                idx++;
            }
            return -1; // key not found
        }

        //recursive search
        public static int helper(Node head,int key){
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return 0;
            }
            int idx = helper(head.next,key);

            if(idx == -1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head,key);
        }

        //print
        public  void print(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        //Reverse a linked list(Iterative)
        public static void reverse(){
            Node prev =null;
            Node curr = tail = head;
            Node next;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        //Removr nth node from End
        public static void deleteNthFromEnd(int n){
            //calculating size
            int sz=0;
            Node temp =head;
            while(temp!=null){
                temp = temp.next;
                sz++;
            }

            if(n==sz){  //if we have to delete head
                head = head.next;
                return;
            }

            Node prev = head;
            int i=1;
            int iToFind = sz-n;
            while(i < iToFind){
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

        //palindrome

        //Calculate mid
        public static Node mid(Node head){
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow =slow.next; //+1
                fast=fast.next.next; //+2
            }
            return slow; 
        }

        public static boolean palindrome(){
            if(head==null || head.next == null){
                return true;
            }
            //step 1 -find mid of LL
            Node midNode = mid(head);
            //step 2 -reverse 2nd half
            Node prev =null;
            Node curr =midNode;
            Node next;
            while(curr!=null){
                next =curr.next;
                curr.next=prev;
                prev =curr;
                curr=next;
            }

            //step3 -compare left right
            Node right = prev;
            Node left = head;

            while(right != null ){
                if(right.data != left.data){
                    return false;
                }
                right = right.next;
                left = left.next;

            }
            return true;
        }

public static void main(String args[]){
    LinkedList ll = new LinkedList();

    // ll.print();
    ll.addFirst(2);
    // ll.print();
    ll.addFirst(1);
    // ll.print();
     ll.addLast(2);
    //  ll.print();
    ll.addLast(1);
    ll.print();

    // ll.add(3,10);
    // ll.print();
    //System.out.println(ll.size);
    // ll.removeFirst();
    // ll.print();
    // ll.removeLast();
    // ll.print();
    // System.out.println(ll.recSearch(4));
    // System.out.println(ll.recSearch(20));
    // ll.reverse();
    // ll.print();

    // ll.deleteNthFromEnd(3);
    // ll.print();

   System.out.println(ll.palindrome());

}
}
