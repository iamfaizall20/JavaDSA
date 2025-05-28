class Node{
    int data;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }
}
class Tree{
    Node root = null;

    public void Insert(int value){
        Node newNode = new Node(value);
        Node current = root;

        if(root == null){
            root = newNode;
        }

        if(current!=null) {
            while (true) {
                if (current.data > value) {
                    if (current.left == null) {
                        current.left = newNode;
                        return;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        return;
                    }
                    current = current.right;
                }
            }
        }
    }
    public boolean Search(Node root,int key){
        while (root!=null) {
            if (key == root.data) {
                return true;
            } else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }
    public boolean SearchUsingRecursion(Node root,int key){
        if(root == null){
            return false;
        }

        if(key > root.data){
            return SearchUsingRecursion(root.right,key);
        }else if(key == root.data){
            return true;
        }else{
            return SearchUsingRecursion(root.left,key);
        }
    }

    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Tree BST = new Tree();

        BST.Insert(8);
        BST.Insert(5);
        BST.Insert(10);
        BST.Insert(3);
        BST.Insert(6);
        BST.Insert(11);
        BST.Insert(14);
        BST.Insert(4);
        BST.Insert(1);

//        BST.inOrderTraversal(BST.root);

        if(BST.SearchUsingRecursion(BST.root,3)){
            System.out.println("Element Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
