
import java.util.Scanner;

public class Delete {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now Enter the Number You Want to Delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(arr, numToDelete);
        System.out.println("Here is Your New Array!!");
        ArrayUtility.displyArray(newArr);

    }

    public static int[] deleteNumber(int[] arr, int numToDelete) {
        int occ = Occurrence.Occurrence(arr, numToDelete);
        if (occ == 0) {
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != numToDelete) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
