package datastructure.linkedlist;

public class MergeSortedList extends LinkedList {


    public static void main(String... args) {

        MergeSortedList first = new MergeSortedList();
        first.createLinkedList(3, 5, 7, 9, 11);

        MergeSortedList second = new MergeSortedList();
        second.createLinkedList(2, 4, 6, 8, 10);

        first.traverseLinkedList(" This is first list ");
        second.traverseLinkedList(" This is second list ");

        Node list = first.mergeSortedList(first.head, second.head);

        first.head = list;

        first.traverseLinkedList("After Merging");

        first = null;
        second = null;

        first  = new MergeSortedList();
        second = new MergeSortedList();

        first.createLinkedList(3, 5, 7, 9, 11);

        second.createLinkedList(2, 4);

        first.traverseLinkedList(" This is Next Round first list ");
        second.traverseLinkedList(" This is Next Round Second list ");

        list = first.mergeSortedList(first.head, second.head);

        first.head = list;

        first.traverseLinkedList("Second Merging");


    }


}
