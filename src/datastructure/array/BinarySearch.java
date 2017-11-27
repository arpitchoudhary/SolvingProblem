package datastructure.array;

public class BinarySearch {

    int binarySearch(int[] arr, int num) {
        int result = -1;

        if (arr == null || arr.length == 0) {
            return result;
        }

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return result;
    }

    public static void main(String... args) {

        int array[] = {21, 32, 43, 74, 75, 86, 97, 108, 149};

        BinarySearch search = new BinarySearch();
        System.out.println("  " + search.binarySearch(array, 43));
    }

}
