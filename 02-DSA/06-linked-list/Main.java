public class Main{
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        

        myLinkedList.append(23);

        System.out.println(myLinkedList.getLength());
        System.out.println("Head: "+myLinkedList.getHead());
        System.out.println("Tail: "+myLinkedList.getTail());
        myLinkedList.printList();
    }
}