
import java.util.Scanner;

public class Search2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayUtility.input2DArray();
        System.out.print("Now Enter the number you Want to Search: ");
        int num = input.nextInt();
        boolean isfound = isFound(arr, num);
        if (isfound) {
            System.out.println("The Number was Found in Array!!");
        } else {
            System.out.println("The Number was Not Found in Array!!");
        }
    }

    public static boolean isFound(int[][] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr.length) {
                if (arr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
