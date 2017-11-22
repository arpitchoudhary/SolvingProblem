package datastructure.linkedlist;

public class PairwiseSwap extends LinkedList {

    public static void main(String... args){

        PairwiseSwap list = new PairwiseSwap();

        list.createLinkedList(23,54,21,43,23,434,12);

        list.traverseLinkedList("Print the list before Swap");

        list.pairWiseSwap(list.head);


    }

}
