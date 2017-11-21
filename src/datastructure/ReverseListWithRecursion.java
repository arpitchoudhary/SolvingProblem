package datastructure;

public class ReverseListWithRecursion extends LinkedList{



    public static void main(String... args){

        ReverseListWithRecursion list = new ReverseListWithRecursion();
        list.createLinkedList(12,32,43,5,6,7,96,3);

        list.traverseLinkedList("\n Print the initial List");

        list.traverseLinkedListInReverse(head);

        list.reverseLinkedListWithRecursion(head);

        list.traverseLinkedList("\n Print the Reversed List");



    }

}
