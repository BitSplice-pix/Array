
public class SumAverage2DArray {

    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        long sum = sum(arr);
        double avg = avg(arr);
        System.out.println("The sum is: " + sum);
        System.out.println("The Average is: " + avg);

    }

    public static long sum(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum = sum + arr[i][j];
                j++;
            }
            i++;

        }
        return sum;

    }

    public static double avg(int[][] arr) {
        if (arr.length == 0) {
            return 0;

        }
        int row = arr.length;
        int cols = arr[0].length;
        double size = row * cols;
        return sum(arr) / size;
    }
}
