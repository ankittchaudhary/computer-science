public class LinkedList {
    private Node head; //default will be null
    private Node tail;
    private int length;

    //Nested or inner class
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    //constructor
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //methods
    public void printList(){
        Node temp = head;
        System.out.print("Linked List: ");
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }

    public int getHead(){
        return head.value;
    }

    public int getTail(){
        return tail.value;
    }

    public int getLength(){
        return length;
    }

    public void append(int value){
        //create the node
        Node newNode = new Node(value);
        //if LL is empty:
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        //if LL not empty we want its last item points to it, 
        else{
            tail.next=newNode; // set 'next' pointer to the newNode
            tail=newNode; //tail will now points to new node
        }
        length++; //increase the length

    }
}
