public class Main{
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(11);
        

        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        System.out.print("Original LL: ");
        myLinkedList.printList();
        //printing removed node value
        //System.out.println("Value of node removed: "+myLinkedList.removeLast().value);

        //in this case there was only 11 and was removed: so LL is empty
        //System.out.println("Node removed: "+myLinkedList.removeLast()); //will give error because null was returned so remove .value

        //prepend
        myLinkedList.prepend(4);
        System.out.print("Updated LL after prepend: ");
        myLinkedList.printList();

        myLinkedList.removeFirst();
        System.out.print("Updated LL after remove first: ");
        myLinkedList.printList();
    }
}