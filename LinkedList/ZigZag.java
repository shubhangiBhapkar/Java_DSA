public class ZigZag {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
        
    }

    

    public void getZigZag(Node head){
        //find mid
        Node slow = head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //alternative merging
        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        while(left!=null && right!=null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
        
    }
    public static void main(String args[]){
        ZigZag zz = new ZigZag();
        zz.addlast(1);
        zz.addlast(2);
        zz.addlast(3);
        zz.addlast(4);
        zz.addlast(5);
        zz.addlast(6);

        zz.print();
        zz.getZigZag(head);
        zz.print();
    }
}
