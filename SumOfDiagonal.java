
public class SumOfDiagonal {

    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        long sum = sumofdiagonal(arr);
        System.out.println("Sum of Diagonals is: " + sum);
    }

    public static long sumofdiagonal(int[][] arr) {
        long leftsum = sumofleftdiagonal(arr);
        long rightsum = sumofrightdiagonal(arr);
        long sum = leftsum + rightsum;
        if (arr.length % 2 != 0) {
            int ind = arr.length / 2;
            sum -= arr[ind][ind];
        }
        return sum;
    }

    public static long sumofleftdiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumofrightdiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int cols = (arr.length - 1) - i;
            sum += arr[i][cols];
            i++;
        }
        return sum;
    }
}
