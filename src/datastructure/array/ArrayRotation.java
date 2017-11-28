package datastructure.array;

public class ArrayRotation {

    /**
     * this algo, will divide the existing array into two sub-array of start,factor-1 && factor-end.
     * then reverse both array individually then finally reverse the whole array
     *
     * @param factor
     * @return
     */
    int[] rotateArrayBy(int[] arr, int factor) {

        if (arr == null || arr.length == 0) {
            System.out.print("can't be empty, returning null handle it!!!");
            return null;
        }

        int start = 0;
        int end = arr.length - 1;
        int endOfFirstSubArray = end - factor;

        // first sub-part of array to reverse {0,1,2,3,4,5,6}
        reverseArray(arr, start, endOfFirstSubArray);

        // reverse the second sub-part
        reverseArray(arr, endOfFirstSubArray + 1, end);

        //reverse the complete array.
        reverseArray(arr, start, end);

        return arr;
    }

    private void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String... args) {

        ArrayRotation rotation = new ArrayRotation();

        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6};

        arr = rotation.rotateArrayBy(arr, 3);

        for (int i : arr) {
            System.out.print(" " + i);
        }

    }
}
