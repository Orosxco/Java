import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        //create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        //prompt the user to input the number elements(n) for the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        //create an array of size n
        int [] arr = new int[n];
        
        //prompt the user to input elements in the array
        System.out.println("Enter the " + n + " elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //call the method to display the array elements in reverse order
        displayArrReverse(arr, 0);
    }
    
    //method to display array elements in reverse order
    public static void displayArrReverse(int[] arr, int idx) {
        //base case: if index reaches the length of the array, return
        if (idx == arr.length) {
            return;
        }
        
        //recursive call to display the next element 
        displayArrReverse(arr, idx + 1);
        
        //print the current element in reverse order after the recursive call 
        System.out.println(arr[idx]);
    }
}
