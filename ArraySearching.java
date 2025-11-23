
import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12, 23, 34, 45, 56, 67, 78, 89};
        System.out.print("Enter the Number you want to want to Search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("The Entered Number is Found!!");
        } else {
            System.out.println("The Entered Number is Not Found!!");
        }

    }

    public static boolean isFound(int[] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
