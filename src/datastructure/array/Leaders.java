package datastructure.array;

/**
 * Given an array of integers, print the leaders in the array. A leader is an element which is larger than all the elements in the array to its right.
 * For example:
 * Input Array:
 * { 98, 23, 54, 12, 20, 7, 27 }
 * Output:
 * Leaders- 27 54 98
 */

public class Leaders {

    public void printLeaders(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Arr can't be null");
        }

        int size = arr.length;
        int currentLeader = arr[size - 1];

        System.out.print("Leaders");

        for (int i = size - 2; i >= 0; i--) {

            if (arr[i] > currentLeader) {
                System.out.print(" " + currentLeader);
                currentLeader = arr[i];
            }

        }
        System.out.print(" " + currentLeader);

    }

    public static void main(String... args) {

        Leaders l = new Leaders();

        int[] arr = new int[]{100, 98, 23, 54, 12, 20, 7, 27};
        l.printLeaders(arr);

    }
}
