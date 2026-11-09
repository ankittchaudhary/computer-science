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

        //get node by index
        myLinkedList.printList(); //print list
        int index = 2;
        System.out.printf("Item at index %d is: ", index);
        System.out.println(myLinkedList.get(index).value);

        //set/update value of node at perticular index
        myLinkedList.printList();
        myLinkedList.set(2, 16);


        myLinkedList.printList();
        //OG LL:  11 3 16 7
        //insert node in between
        myLinkedList.insert(2, 24);  //24 node at index 2 meaning at 23, so 23 move ahead
        myLinkedList.printList(); //11 3 24 16 7

        //remove node at perticulat index let say 2 index from above which is 24, 11-> 3 ->24->16->7
        myLinkedList.remove(2);
        myLinkedList.printList();

        //reverse
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}