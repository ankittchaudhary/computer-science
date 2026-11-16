public class Main{
    public static void main(String[] args) {
        // LinkedList myLinkedList = new LinkedList(11);
        

        // myLinkedList.append(3);
        // myLinkedList.append(23);
        // myLinkedList.append(7);

        // System.out.print("Original LL: ");
        // myLinkedList.printList();
        // //printing removed node value
        // //System.out.println("Value of node removed: "+myLinkedList.removeLast().value);

        // //in this case there was only 11 and was removed: so LL is empty
        // //System.out.println("Node removed: "+myLinkedList.removeLast()); //will give error because null was returned so remove .value

        // //prepend
        // myLinkedList.prepend(4);
        // System.out.print("Updated LL after prepend: ");
        // myLinkedList.printList();

        // myLinkedList.removeFirst();
        // System.out.print("Updated LL after remove first: ");
        // myLinkedList.printList();

        // //get node by index
        // myLinkedList.printList(); //print list
        // int index = 2;
        // System.out.printf("Item at index %d is: ", index);
        // System.out.println(myLinkedList.get(index).value);

        // //set/update value of node at perticular index
        // myLinkedList.printList();
        // myLinkedList.set(2, 16);


        // myLinkedList.printList();
        // //OG LL:  11 3 16 7
        // //insert node in between
        // myLinkedList.insert(2, 24);  //24 node at index 2 meaning at 23, so 23 move ahead
        // myLinkedList.printList(); //11 3 24 16 7

        // //remove node at perticulat index let say 2 index from above which is 24, 11-> 3 ->24->16->7
        // myLinkedList.remove(2);
        // myLinkedList.printList();

        // //reverse
        // myLinkedList.reverse();
        // myLinkedList.printList();


        // //Leetcode Q1: find middle node
        // // LL is 7 16 3 11 so even condtion so should return 3
        // System.out.println(myLinkedList.middleNode().value); //3

        // //odd condition as: current LL is 7, 16, 3, 11, so append one more
        // myLinkedList.append(9);
        // myLinkedList.printList();
        // System.out.println(myLinkedList.middleNode().value); //should return 3

        //create another LL for hasLoop question
        LinkedList ll1 = new LinkedList(1);
        ll1.append(2);
        ll1.append(3);
        ll1.append(4);
        ll1.append(5);

        ll1.printList();
        System.out.println(ll1.hasLoop()); //false

        ll1.createLoop(2);
        System.out.println(ll1.hasLoop());

        //here we can use hasLoop code to check if LL has loop so avoid printing that, because it will create infinite loop
        if(!ll1.hasLoop()){
            ll1.printList(); //will not execute
        }

        //System.out.println(ll1.length());
        
    }
}