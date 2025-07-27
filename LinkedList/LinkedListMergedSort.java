public class LinkedListMergedSort {
    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
           head = tail = newNode;
           return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast !=null && fast.next!= null){
            slow = slow.next; //+1
            fast = fast.next.next;           
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2){
         
        Node MergedLL = new Node(-1);
        Node temp = MergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return MergedLL.next;
    }

    public Node MergeSort(Node head){
       if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //sort left and right 
         Node rightHead = mid.next;
         mid.next = null;
         Node newLeft = MergeSort(head);
         Node newRight = MergeSort(rightHead);

        //merge sorted left part and right part
        return merge(newLeft,newRight);
    }

    public static void main(String args[]){
        LinkedListMergedSort ll = new LinkedListMergedSort();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print(head);
        head = ll.MergeSort(head);  //storing sorted head
        ll.print(head);


    }
}
