import java.io.*;
import java.util.*;

public class PrintDecreasing {
    public static void main(String[] args) throws Exception {
        //create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        //Prompt the user to enter a number(n)
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        //call the method to print numbers decreasing from n to 1
        PrintDecreasing(n);
    }
    
    //method to print decreasing numbers from n to 1
    public static void PrintDecreasing(int n) {
        //base case: if n is 0, return (stop recursion)
        if (n == 0) return;
        
        //print the current value of n
        System.out.println(n);
        
        //recursive call to print the next smaller number
        PrintDecreasing(n - 1);
    }
}
