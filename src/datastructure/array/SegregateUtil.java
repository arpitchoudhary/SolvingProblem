package datastructure.array;

/**
 * Input - lets suppose we have an array like this [1,1,1,2,0,0,0,2,2,1]
 * output - [0,0,0,1,1,1,1,2,2,2]
 */
public class SegregateUtil {

    void segregate(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.print("can't be empty!!!");
            return;
        }

        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {

            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;

            }

        }

        for (int i : arr) {
            System.out.print(" " + i);
        }

    }

    private void swap(int[] arr, int first, int sec) {

        if (arr[first] == arr[sec])
            return;

        arr[first] = arr[first] + arr[sec];
        arr[sec] = arr[first] - arr[sec];
        arr[first] = arr[first] - arr[sec];
    }

    public static void main(String... args) {

        SegregateUtil util = new SegregateUtil();
        util.segregate(new int[]{1, 1, 1, 2, 0, 0, 0, 2, 2, 1});

    }
}
