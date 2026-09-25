import java.util.*;
class CheckPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String as an input to check whether it is a Palindrome or not.");
    String input = sc.nextLine();
    // Checking whether Palindrome or not
    if (isPalindrome(input)) {
      System.out.println(input + " is a Palindrome String");
    }
    else {
      System.out.println(input + " is not a Palindrome String");
    }
  }
  public static boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
