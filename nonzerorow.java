import java.util.Scanner;

public class NonZeroRow {
    public static boolean isNonZeroRow(int r, int[][] array2D) {
        for (int i = 0; i <  array2D[r].length; i++) {
            if (array2D[r][i] == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the array:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the array: ");
        int cols = sc.nextInt();

        int [][] array2D = new int[rows][cols];

        System.out.println("Enter the elements of the 2D array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the row index to check: ");
        int rowIndex = sc.nextInt();

        boolean result = isNonZeroRow(rowIndex, array2D);

        if (result) {
            System.out.println("Row " + rowIndex + " is a non zero row");
        } else {
            System.out.println("Row " + rowIndex + " contains zero(s)");
        }
    }
}
