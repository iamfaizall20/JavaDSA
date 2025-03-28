class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkList {
    Node head;

    //Method to add new node in the last
    public void AddNode(int data){
        Node newNode = new Node(data); //creates new node and assigns value to it

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head; //creating clone of head so that head remain unaltered
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void CountNodes(){
        Node temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println(count+" Nodes");
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.AddNode(12);
        list.AddNode(15);
        list.AddNode(18);
        list.AddNode(20);

        list.CountNodes();
    }
}
