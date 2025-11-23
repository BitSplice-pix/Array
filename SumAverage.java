
public class SumAverage {

    public static void main(String[] args) {
        System.out.println("Lets Perform Sum And Average");
        int[] numArray = ArrayUtility.inputArray();
        long Sum = sum(numArray);
        int Avg = avg(numArray);
        System.out.print("The Sum of the Numbers is: " + Sum);
        System.out.print("\nThe Average of the Numbers is: " + Avg);

    }
    public static long sum(int[] numArray) {
        int sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static int avg(int[] numArray){
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
