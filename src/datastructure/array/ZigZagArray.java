package datastructure.array;

/**
 * // its the array where element is greater than left and smaller than right. Means Element follow < > alternatively
 * <p>
 * 5,10,8,12,6,9,4
 */
public class ZigZagArray {

    void printZigZagArray(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.print("can't be empty!!!");
            return;
        }

        boolean flag = false;
        int i = 0;

        while (i < arr.length - 1) {

            if (!flag && arr[i] < arr[i + 1]) {

            } else if (flag && arr[i] > arr[i + 1]) {
            } else {
                swap(arr, i, i + 1);
            }

            i++;
            flag = !flag;

        }

        for (int j : arr) {
            System.out.print(" " + j);
        }

    }

    private void swap(int[] arr, int i, int i1) {
        arr[i] = arr[i] + arr[i1];
        arr[i1] = arr[i] - arr[i1];
        arr[i] = arr[i] - arr[i1];
    }

    public static void main(String... args) {

        int[] arr = new int[]{3, 4, 6, 2, 1, 8, 9};

        ZigZagArray zagArray = new ZigZagArray();
        zagArray.printZigZagArray(arr);

    }
}
