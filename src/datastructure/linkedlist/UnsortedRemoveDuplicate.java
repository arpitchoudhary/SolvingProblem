package datastructure.linkedlist;


public class UnsortedRemoveDuplicate extends LinkedList {

    public static void main(String... args) {

        UnsortedRemoveDuplicate duplicate = new UnsortedRemoveDuplicate();

        duplicate.createLinkedList(6, 4, 2, 6, 6, 6, 10, 11);

        duplicate.traverseLinkedList("Here is the list");

        duplicate.removeDuplicate(duplicate.head);

        duplicate.traverseLinkedList("After remove");
    }
}
