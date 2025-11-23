
import java.util.Scanner;

public class Occurrence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lets Count the Occurence of the Number!!");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the Number you want to Check for Occurrence: ");
        int num = input.nextInt();
        int occurrence = Occurrence(arr,num);
        System.out.println("The Numbers have Occured " + occurrence + " times");

    }

    public static int Occurrence(int[] arr, int num) {
        int occ = 0;
        int i = 0;
        while (i < arr.length) {
            if ( arr[i] == num ){
                occ++;
            }
            i++;
        }
        return occ;
    }
}

