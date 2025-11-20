
public class Array1 {

    public static void main(String[] args) {
        // int[] myArr = new int[5];
        // myArr[0] = 45;
        // myArr[3] = 67;
        // myArr[2] = 78;
        // myArr[1] = 32;
        // myArr[4] = 98;
        int[] myArr = {45, 32, 78, 67, 98};

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[2]);
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);
        int index = 0; //This is called Array Travesal
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr = new String[4];
        strArr[0]= "My First String";

        String[] newStrArr = {"first", "second","third"};
        System.out.println(newStrArr.length);

    }
}
