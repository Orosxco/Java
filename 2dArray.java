import java.util.Scanner;

public class RepresentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        
        int[][] arr = new int[n][m];
        
        System.out.println("Enter the elements of 2D Array: ");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
        }
        }
        
        System.out.println("The entered 2D Array is: ");
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        }
    }
}
