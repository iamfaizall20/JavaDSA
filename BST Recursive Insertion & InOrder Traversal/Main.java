//Implemented BST using Recursive Insert Function and InOrder Traversal
public class Main {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node insert(Node root,int value){
        if(root == null){
            root = new Node(value);
            return root;
        }

        if(value > root.data){
            root.right = insert(root.right,value);
        }
        else{
            root.left = insert(root.left,value);
        }
        return root;
    }

    public static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        int[] value = {5,1,3,4,2,7};
        Node root = null;

        for (int k: value) {
            root = insert(root,k);
        }

        inOrderTraversal(root);
    }
}
