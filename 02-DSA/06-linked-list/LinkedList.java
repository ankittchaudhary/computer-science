public class LinkedList {
    private Node head; //default will be null
    private Node tail;
    private int length;

    //Nested or inner class //helper
    class Node{
        int value;
        Node next; //type of next pointer is node itself

        //constructor
        Node(int value){
            this.value=value;
        }
    }

    //constructor
    public LinkedList(int value){
        Node newNode = new Node(value); //create node
        head = newNode; //assign head to node created
        tail = newNode; //as single item so tail also point to same node
        length = 1;  //single so 1
    }

    //methods
    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }

        //print properties
        System.out.println("| Head: "+getHead()+", Tail: "+getTail()+ ", Length: "+getLength());
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

    //add item in end O(1)
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

    //O(n)
    public Node removeLast(){
        //case : empty linkedlist
        if(length==0) return null;

        Node temp = head;
        Node prev = head;

        while (temp.next!=null) {
            prev=temp;  
            temp=temp.next; //last node it will be
        }
        //we will have prev pointing to second last
        //now temp.next is null means it is the last node that need to be removed
        tail=prev; //setting the second last to tail so it become last
        tail.next=null; //setting tail.next means there is no node ahead of last node
        length--; //dec. the length

        //condition: if only one node was there, we cant have length =0 and head,tail pointing to some node
        if(length==0){
            head=null;
            tail=null;
        }

        //temp is the last node that was removed
        return temp; //returning node removed
    }

    //prepend O(1)
    public void prepend(int value){
        Node newNode = new Node(value); //create the node first

        //check if LL is empty
        if(length==0){
            head=newNode;
            tail=newNode;
        } else{
            newNode.next=head; //link it
            head=newNode;
        }


        //inc length as in either case one node is added
        length++;
    }

    //remove first O(1)
    public Node removeFirst(){
        //empty LL condition
        if(length==0) return null;

        Node temp = head; //the one we need to remove
        
        head=head.next; //assigning head to the next one, if one was there then head.next is null so head will become null

        temp.next=null; //unlink temp
        length--; //dec length by one

        //condition: if only one node was there and removed so length become zero
        if(length==0){
            //head=null; //already null as head.next is null if one node was there
            tail=null;
        }

        return temp;
    }

    //get node at perticular index: O(n) as loop comes into picture
    public Node get(int index){  //suppose index 3 so loop execute 3 times as starting from 0, so 0, 1, 2
        if(index < 0 || index>=length) return  null;

        Node temp = head;
        for(int i =0; i<index; i++){          //LL was 11 3 23 7 : 1st iteration temp->3 : 2nd iteration i=1, temp->23 : iteration 3 i=2, temp->7 and comes out 
            temp=temp.next;
        }
        return temp;
    }

    //set value of node at perticular index, more like updating
    public boolean set(int index, int value){
        // if(index<0||index >= length) return false;

        // Node temp=head;
        // for(int i =0; i<index; i++){
        //     temp=temp.next;
        // }
        //can replace above with this 
        Node temp= get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }

        return false;
    }

    //insert a node at perticular index: consider LL: 11 3 23 7
    public boolean insert(int index, int value){ //index = 2, 23 is here
        if(index<0 || index>length) return false;

        if(index==0){
            prepend(value);
            return true;
        }

        if(index==length){ //in the end
            append(value);
            return true;
        }

        Node newNode = new Node(value);  //let say node 5 is created
        // Node temp = head;
        // Node prev = head;
        // for(int i =0; i<index; i++){
        //     prev = temp;
        //     temp = temp.next;
        // }
        // if(temp!=null){
        //     //temp at this point is now pinting to node at that perticular index let say index 2 which points to 23
        //     prev.next=newNode; //prev points to node(3) and we are saying node(3) now points to new node 5
        //     newNode.next=temp; //new node(5) points to temp(which was 23) and 23 was alreading pointing to 7
        //     length++; //increase the length as new node has been created
        // }
        Node temp = get(index-1); //node before the node, it will be node(3) at index 1
        newNode.next=temp.next; //new node(5) points to 3's ahead which is 23
        temp.next=newNode; //3 points to new node which is 5

        length++;
        
        return true;
    }

}
