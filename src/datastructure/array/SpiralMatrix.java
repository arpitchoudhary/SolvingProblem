package datastructure.array;

/**
 * Input -
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,8,5,3]
 * [11,12,13,14]
 */
public class SpiralMatrix {

    void printSpiral(int[][] mat, int row, int col) {

        int k = 0, l = 0, lastRow = row - 1, lastCol = col - 1;

        while (k <= lastRow && l <= lastCol) {

            for (int i = l; i <= lastCol; i++) {
                System.out.print(" " + mat[k][i]);
            }
            k++;
            System.out.print("\n");

            for (int i = k; i <= lastRow; i++) {
                System.out.print(" " + mat[i][lastCol]);
            }
            lastCol--;
            System.out.print("\n");

            if (k <= lastRow) {
                for (int i = lastCol; i >= l; i--) {
                    System.out.print(" " + mat[lastRow][i]);
                }
            }
            lastRow--;
            System.out.print("\n");

            if (l <= lastCol) {
                for (int i = lastRow; i >= k; i--) {
                    System.out.print(" " + mat[i][l]);
                }
                l++;
            }
            System.out.print("\n");

        }

    }

    public static void main(String... args) {

        int mat[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 8, 5, 3}, {11, 12, 13, 14}};

        SpiralMatrix matrix = new SpiralMatrix();
        matrix.printSpiral(mat, mat.length, mat[0].length);

    }
}
