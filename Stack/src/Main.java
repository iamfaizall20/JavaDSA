public class Main {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        static Node head;

        public void Push(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }

        public void Pop(){

            if(head == null) {
                System.out.println("Stack is empty");
            }else{
               int top = head.data;
               head = head.next;
            System.out.println("Popped Value: "+top);
            }

        }

        public void Peek(){


            if(head == null) {
                System.out.println("Stack is Empty");
            }else{
                int top = head.data;
            System.out.print("Top -> "+top);
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.Push(12);
        s.Push(15);
        s.Push(45);
        s.Push(10);
        s.Push(64);
        s.Push(28);
        s.Push(16);

        System.out.println();
        s.Peek();
        s.Pop();

        System.out.println();
        Node temp = Stack.head;

        while( temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}