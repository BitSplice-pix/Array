
public class MaxMinArray {

    public static void main(String[] args) {
        System.out.println("Lets Find Max ans Min!!");
        int[] arr = ArrayUtility.inputArray();
        int min = min(arr);
        int max = max(arr);
        System.out.println("The Maximum Number is: " + max);
        System.out.println("The Minimum Number is: " + min);
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] arr) {

        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (max < arr[i]) {
                max = arr[i];

            }
            i++;
        }
        return max;
    }
}
