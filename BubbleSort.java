import java.util.Scanner;

class BubbleSort {
    //An optimized version of BubbleSort
    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;

        //Outer loop to traverse through all elements
        for (i = 0; i < n - 1; i++) {
            swapped = false;

            //Inner loop to compare adjacent elements 
            for (j = 0; j < n - i - 1; j++) {
                //if the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            //if no elements were swapped, the array is already sorted, break out of the loop
            if (!swapped)
                break;
        }
    }

    //funtion to print the array
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
        public static void main(String args[]) {
            //Create a scanner object to read input for the user 
            Scanner sc = new Scanner(System.in);

            //Prompt user for the number of elements in the array
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            //Create an array to store elements
            int[] arr = new int[n];

            //Prompt user to input the elements of the array
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); //Read each element
        }

        //Call the bubblesort method to sort the array
        bubbleSort(arr, n);

        //Display the sorted array 
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
