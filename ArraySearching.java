
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
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
