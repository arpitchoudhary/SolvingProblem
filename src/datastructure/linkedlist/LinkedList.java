package datastructure.linkedlist;

import com.sun.istack.internal.NotNull;

public class LinkedList {

    Node head;
    private int maxValue;

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

        maxValue = 0;

        if (values.length == 0) {
            System.out.println("Should not be empty, returning an node with 0 value");
            return new Node(0);
        }

        if (head == null) {
            head = new Node(values[0]);
            maxValue = values[0];
        }

        Node temp = head;

        for (int i = 1; i < values.length; i++) {

            if (maxValue <= values[i]) {
                maxValue = values[i];
            }

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


    public void reverseRecursion() {
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


    /**
     * method to merge two sorted linked list
     *
     * @param first
     * @param second
     * @return
     */
    public Node mergeSortedList(Node first, Node second) {
        Node sortedList = null;
        Node temp = null;

        while (first != null && second != null) {

            if (first.data <= second.data) {
                if (sortedList == null) {
                    sortedList = new Node(first.data);
                    temp = sortedList;
                    first = first.next;
                } else {
                    temp.next = new Node(first.data);
                    first = first.next;
                    temp = temp.next;
                }

            } else {
                if (sortedList == null) {
                    sortedList = new Node(second.data);
                    temp = sortedList;
                    second = second.next;
                } else {
                    temp.next = new Node(second.data);
                    second = second.next;
                    temp = temp.next;
                }

            }
        }

        while (first != null) {
            temp.next = new Node(first.data);
            first = first.next;
            temp = temp.next;
        }

        while (second != null) {
            temp.next = new Node(second.data);
            second = second.next;
            temp = temp.next;
        }


        return sortedList;
    }

    /**
     * Merge two linked sorted list recursively.
     *
     * @param left
     * @param right
     * @return
     */
    public Node mergeSortListRecursive(Node left, Node right) {
        Node result = null;

        if (left == null)
            return right;

        if (right == null)
            return left;

        if (left.data <= right.data) {
            result = left;
            result.next = mergeSortListRecursive(left.next, right);
        } else {
            result = right;
            result.next = mergeSortListRecursive(left, right.next);
        }

        return result;
    }

    /**
     * return the merge point for the two linked list,
     * return nulls if there is no merge point between two lists
     *
     * @param first
     * @param second
     * @return
     */
    public Node mergePointInList(Node first, Node second) {

        Node result = null;

        int firstLength = getLength(first);
        int secondLength = getLength(second);
        int difference = firstLength - secondLength;

        if (firstLength < secondLength) {

            Node temp = first;
            first = second;
            second = temp;
            difference *= -1;
        }


        for (int i = 0; i < difference; i++) {
            first = first.next;
        }

        while (first != null && second != null) {
            if (first == second) {
                result = first;
                return result;
            }

            first = first.next;
            second = second.next;
        }

        return result;
    }

    private int getLength(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getLength(node.next);
    }

    /**
     * 1->2->3->4->5 then the function should change it to 2->1->4->3->5
     */
    public void pairWiseSwap(Node node) {

        Node traverse = node;

        while (node != null && node.next != null) {
            int temp = node.data;
            node.data = node.next.data;
            node.next.data = temp;
            node = node.next.next;
        }


        while (traverse != null) {
            System.out.print(" ---- " + traverse.data);
            traverse = traverse.next;
        }

    }

    /**
     * api to detect if there is any loop in the list
     * if remove loop is true than remove the loop after detecting it.
     *
     * @param head
     * @param
     */
    void detectLoopInList(Node head, boolean removeLoop) {

        if (head == null || head.next == null) {
            System.out.println("There is no loop in the list");
            return;
        }

        Node slw = head;
        Node fst = slw;

        boolean isFound = false;

        while (slw != null && fst != null && fst.next != null) {

            slw = slw.next;
            fst = fst.next.next;

            if (slw == fst) {
                isFound = true;
                break;
            }


        }

        if (!isFound) {
            System.out.println("No Loop Detected");
            return;
        }

        detectStartPoint(head, slw, removeLoop);

    }

    private void detectStartPoint(Node head, Node slw, boolean removeLoop) {

        Node temp = head;
        Node removeLinkOf = null;

        while (temp != slw) {

            if (removeLoop && temp.next == slw.next) {
                removeLinkOf = slw;
            }

            temp = temp.next;
            slw = slw.next;
        }

        System.out.println(" The Node " + temp.data + " is starting point of the loop in the list ");
        removeLinkOf.next = null;

    }


    /***
     * Remove
     * @param head  [6, 4, 2, 6, 10, 11]
     */
    public void removeDuplicate(Node head) {

        int[] hash = new int[maxValue];
        Node current = head;
        Node prev = null;

        while (current != null) {

            if (hash[current.data - 1] == 1) {
                prev.next = current.next;
                current = current.next;
                continue;
            } else {
                hash[current.data - 1] = 1;
            }

            prev = current;
            current = current.next;
        }

    }

}
