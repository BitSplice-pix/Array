
public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("Let's Reverse the Array's Element!!");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("The reverse of Array is: ");
        reverse(arr);
        ArrayUtility.displyArray(arr);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
