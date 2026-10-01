import java.util.Scanner;
import java.util.Arrays;

class CheckAnagram {

    // Function to check whether two strings are anagrams of eachother
    static boolean areAnagram(char[] str1, char[] str2) {
        // Get lengths of both the Strings
        int n1 = str1.length;
        int n2 = str2.length;

        // if lengths of both Strings is not the same, they cannot be anagrams
        if (n1 != n2) 
            return false;

        // Sort both String
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted Strings
        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i])
                return false;
        }

        return true; // If all characters match they are anagrams
    }   

    public static void main(String[] args) {
        //Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input the first String
        System.out.println("Enter the first String");
        String input1 = sc.nextLine();

        // Ask the user to input the second String
        System.out.println("Enter the Second String");
        String input2 = sc.nextLine();

        // Convert the strings into character arrays
        char[] str1 = input1.toCharArray();
        char[] str2 = input2.toCharArray();

        // Check whether the Strings are anagrams of eachother
        if (areAnagram(str1, str2))
            System.out.println("The two strings are anagrams of eachother");
        else
            System.out.println("The two strings are not anagrams of eachother");
    }
}
