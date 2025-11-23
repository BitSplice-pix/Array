public class Sort{
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        boolean isInc= isIncresing(arr);
        boolean isDec = isDecreasing(arr);
        if ( isInc || isDec ){
            System.out.println("The Array is Sorted");
        }else{
            System.out.println("The Array is Not Sorted");
        }
    }

    public static boolean isIncresing(int[] arr){
        int i = 1;
        while( i < arr.length){
            if( arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr){
         int i = 1;
        while( i < arr.length){
            if( arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}