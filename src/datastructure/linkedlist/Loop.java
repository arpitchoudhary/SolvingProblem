package datastructure.linkedlist;

public class Loop extends LinkedList {

    public static void main(String... args) {

        Loop loop = new Loop();

        loop.createLinkedList(34, 235, 42, 1, 49, 54, 3, 11, 7, 21);

        System.out.println("\n lets create a loop into the list");

        Node linkTo = null;
        Node temp = loop.head;

        while (temp.next != null) {

            if (temp.data == 49) {
                linkTo = temp;
            }

            temp = temp.next;
        }

        temp.next = linkTo;

        System.out.println("\n lets find out if there is a loop in the list via the coded api");

        loop.detectLoopInList(loop.head, true);

        loop.traverseLinkedList("\n we can traverse the linked list with our existing api, as it need breaking condition");




    }

}
