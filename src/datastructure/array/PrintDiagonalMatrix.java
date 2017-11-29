package datastructure.array;

/**
 * Input -
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,8,5,3]
 * <p>
 * Output -
 * 1
 * 5,2
 * 9,6,3
 * 8,7,4
 * 5,8
 * 3
 */
public class PrintDiagonalMatrix {

    void printDiagonal(int[][] arr) {

        int col = arr[0].length;
        int row = arr.length;

        for (int k = 0; k < row; k++) {

            int i = k, j = 0;
            do {
                System.out.print("  " + arr[i][j]);
                i--;
                j++;
            } while (i >= 0);

            System.out.print("\n");
        }

        for (int k = 1; k < col; k++) {

            int i = row - 1, j = k;
            do {
                System.out.print("  " + arr[i][j]);
                i--;
                j++;
            } while (j < col);

            System.out.print("\n");
        }


    }

    public static void main(String... args) {

        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 8, 5, 3}};

        /**
         * [1,2,3]
         * [5,6,7]
         * [9,8,5]
         */
        int arr1[][] = {{1, 2, 3}, {5, 6, 7}, {9, 8, 5}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        PrintDiagonalMatrix diagonalMatrix = new PrintDiagonalMatrix();
        diagonalMatrix.printDiagonal(arr);
        diagonalMatrix.printDiagonal(arr1);
    }

}
