package eight.Arrays.basic;

public class test01 {
    public static void main(String[] args) {

        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i * 5;
        }
        printArray(myArr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + ", value is " + arr[i]);
        }
    }
}
