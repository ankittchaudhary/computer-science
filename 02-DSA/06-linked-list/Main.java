public class Main{
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(11);
        

        //myLinkedList.append(3);
        //myLinkedList.append(23);
        // myLinkedList.append(7);
        // myLinkedList.append(4);

        // System.out.println(myLinkedList.getLength());
        // System.out.println("Head: "+myLinkedList.getHead());
        // System.out.println("Tail: "+myLinkedList.getTail());
        myLinkedList.printList();



        System.out.println();
        //printing removed node value
        System.out.println("Value of node removed: "+myLinkedList.removeLast().value);

        //in this case there was only 11 and was removed: so LL is empty
        System.out.println("Node removed: "+myLinkedList.removeLast()); //will give error because null was returned so remove .value
        myLinkedList.printList();
    }
}