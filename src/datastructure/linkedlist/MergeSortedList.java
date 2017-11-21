package datastructure.linkedlist;

public class MergeSortedList extends LinkedList{


    public static void main(String... args){

        MergeSortedList first = new MergeSortedList();
        first.createLinkedList(3,5,7,9,11);

        MergeSortedList second = new MergeSortedList();
        second.createLinkedList(2,4,6,8,10);

        first.traverseLinkedList(" This is first list ");
        second.traverseLinkedList(" This is second list ");


    }
}
