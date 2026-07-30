import java.util.*;

public class ArraylistTrial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of arrays you want to input: ");
        int n = sc.nextInt();
        
        //creating 2d ArrayList to store multiple Arraylist object of integers
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //loop through to input each sub-array
        for (int i = 0; i < n; i++) {
            //Prompting user to input size of the current sub-array
            System.out.print("Enter the size of sub-array " + (i + 1) + ": ");
            int n1 = sc.nextInt();
            
            //Creating new ArrayList to store elements of subArray
            ArrayList<Integer> l2 = new ArrayList<>();
            
            //Prompting user to input the elements of current sub-array
            System.out.println("Enter the " + n1 + " elements of array " + (i + 1) + ": ");
            for (int j = 0; j < n1; j++) {
                l2.add(sc.nextInt());
            }
            list.add(i, l2);
        }
        //Prompting user to input the number of queries to process(num)
        System.out.print("Enter the number of queries to process: ");
        int num = sc.nextInt();
        //loop through for each query
        for (int k = 0; k < num; k++) {
            //Prompting user to input row(n) and column(o) for each query
            System.out.print("Enter row and column for query " + (k + 1) + ": ");
            int m = sc.nextInt();
            int o = sc.nextInt();
            
            try {
                //trying to print the element at the specified row and column
                System.out.println("Element at (" + m +", " + o + "): " + list.get(m - 1).get(o - 1));
            }
            catch (Exception e) {
                //if an exception occurs(index out of bounds), print ERROR
                System.out.println("ERROR!");
            }
        }
    }
}
