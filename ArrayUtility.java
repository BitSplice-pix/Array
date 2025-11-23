
import java.util.Scanner;

public class ArrayUtility {

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Size of Array: ");
        int size = input.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the Element of " + (i + 1) + ": ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number of row: ");
        int row = input.nextInt();
        System.out.print("Please Enter the Number of column: ");
        int column = input.nextInt();
        int[][] num = new int[row][column];

        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < column) {
                System.out.print("Please Enter Element of row: " + (i + 1) + ", column: " + (j + 1) + " :");
                num[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return num;
    }

    public static void displyArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

    }
}
