public class BinaryTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) { // jr elemenent -1 asn tr to null asto so tyach left right bnvaychi grj nahi mg
                                    // null return krun dil
                return null;
            }
            // jr -1 nsn tr navin node create kraycha
            Node newNode = new Node(nodes[idx]);

            // now creating left and right parts of tree
            // we assume buildTree is recursive function and return its works
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data); // 1
        // System.out.println(root.left.data); //2
    }
}