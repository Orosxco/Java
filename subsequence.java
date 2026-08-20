import java.util.*;

public class Subsequence {
    //recursive function to print all possible subsequences for a giver array
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path) {

        //Print the subsequence when reaching the leaf of the recursion tree
        if (index == arr.length) {
            //condition to avoid printing and empty subsequence
            if (path.size() > 0) {
                System.out.println(path);
            }
        }
        else {
            //Subsequence without including the element at the current index
            printSubsequences(arr, index + 1, path);

            //Include the element at the current index in the subsequence 
            path.add(arr[index]);

            //subsequence incuding the element at the current index
            printSubsequences(arr, index + 1, path);

            //backtrack to remove the recently added element
            path.remove(path.size() - 1);
        }
    }
    //main method entry point of the program
    public static void main(String[] args) {
        //define the array for which subsequence are to be printed 
        int[] arr = {1, 2, 3};

        //create an auxiliary space to store each path
        ArrayList<Integer> path = new ArrayList<>();

        //call the method to print all subsequences
        printSubsequences(arr, 0, path);
    }
} 
