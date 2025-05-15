class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
class Tree{
    Node root;

    public void insert(int data){
        Node newNode = new Node(data);
        Node current = root;

        if(root == null){
            root = newNode;
            return;
        }

        while (true){
        if(data < current.data){
            if(current.left == null){
                current.left = newNode;
                return;
            }
            current = current.left;
        }else{
            if(current.right == null){
                current.right = newNode;
                return;
            }
            current = current.right;
            }
        }
    }
    //Inorder Traversal LNR
    public void inorderTraversal(Node node){
        if(node!=null){
            inorderTraversal(node.left);
            System.out.print(node.data+" ");
            inorderTraversal(node.right);
        }
    }
    //PreOrder Traversal NLR
    public void preOrderTraversal(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }
    //PostOrder Traversal LRN
    public void postOrderTraversal(Node node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data+" ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
    Tree BST = new Tree();

    BST.insert(15);
    BST.insert(21);
    BST.insert(14);
    BST.insert(30);
    BST.insert(10);
    BST.insert(5);

    System.out.print("Inorder: ");
    BST.inorderTraversal(BST.root);
    System.out.println();

    System.out.print("PostOrder: ");
    BST.postOrderTraversal(BST.root);
    System.out.println();

    System.out.print("PreOrder: ");
    BST.preOrderTraversal(BST.root);

    }
}