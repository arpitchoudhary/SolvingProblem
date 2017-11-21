package datastructure.linkedlist;

import com.sun.istack.internal.NotNull;

public class LinkedList {

    // only to make this accessible inside main method
    Node head;

    /**
     * sample node class
     */
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }


    /**
     * method to traverse the linkedList
     */
    public void traverseLinkedList(String message) {

        System.out.println(message);
        System.out.println("=========================");

        Node node = this.head;
        while (node != null) {
            System.out.print("|---- " + node.data + " -----|");
            node = node.next;
        }

        System.out.println("\n");
        System.out.println("\n");
    }

    /***
     *
     * @param values
     * @return
     */
    public Node createLinkedList(@NotNull int... values) {

        if (values.length == 0) {
            System.out.println("Should not be empty, returning an node with 0 value");
            return new Node(0);
        }

        if (head == null) {
            head = new Node(values[0]);
        }

        Node temp = head;

        for (int i = 1; i < values.length; i++) {
            temp.next = new Node(values[i]);
            temp = temp.next;
        }

        return head;
    }

    /**
     * method to create the single node
     *
     * @param number
     * @return
     */
    public Node createSingleNode(int number) {
        this.head = new Node(number);
        return head;
    }


    public void reverseRecursion(){
        reverseLinkedListWithRecursion(head);
    }

    /**
     * Reverse the list with recursion
     *
     * @param node
     */
    public void reverseLinkedListWithRecursion(Node node) {

        if (node.next == null) {
            head = node;
            return;
        }

        reverseLinkedListWithRecursion(node.next);

        Node temp = node.next;
        temp.next = node;
        node.next = null;

    }

    public void traverseReverse() {
        traverseLinkedListInReverse(head);
    }

    public void traverseLinkedListInReverse(Node node) {

        if (node == null) {
            return;
        }

        traverseLinkedListInReverse(node.next);
        System.out.print(" ---- " + node.data);

    }

}
