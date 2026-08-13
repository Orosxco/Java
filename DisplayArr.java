import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        //create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        //ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        
        int[] arr = new int[n];
        
        //ask the user to input the elements of the array
        System.out.println("Enter the " + n + " elements of the array: ");
        for (int i = 0;i < n;i++) {
            arr[i] = sc.nextInt();//Store each element in the array
            }
            //call the method to display the array elements starting from index 0
            displayArr(arr, 0);
    }
        
        //method to display array elements recursively
        public static void displayArr(int[] arr, int idx) {
            if (idx == arr.length) {
                return;
            }
            System.out.println(arr[idx]);
            
            displayArr(arr, idx + 1);
        }
}
