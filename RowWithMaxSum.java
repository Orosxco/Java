import java.util.Scanner;

public class RowWithMaxSum {
    public static int[] getRowWithMaxSum(int[][] array2D) {
    int[] maxRow = array2D[0];
    int maxSum = 0;

    for (int i = 0; i < array2D.length; i++) {
        int sum = 0;

        for (int j = 0; j < array2D[i].length; j++) {
            sum += array2D[i][j];
        }

        if (sum > maxSum) {
            maxSum = sum;
            maxRow = array2D[i];
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the number of rows in the array: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns in the array: ");
            int cols = sc.nextInt();

            int[][] array2D = new int[rows][cols];

            System.out.println("Enter the elements of the 2D array: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array2D[i][j] = sc.nextInt();
                }
            }

            int[] result = getRowWithMaxSum(array2D);

            System.out.println("The row with the maximum sum is ");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
