
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Checking the Array is Palindrome or Not");
        int[] arr = ArrayUtility.inputArray();
        boolean ispalindrome = isPalindrome(arr);
        if (ispalindrome) {
            System.out.println("The Entered Array is Palindrome!!");
        } else {
            System.out.println("The Entered Array is Not a Palindrome!!");
        }
    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;

    }
}
