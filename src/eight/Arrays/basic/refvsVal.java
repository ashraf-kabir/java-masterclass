package eight.Arrays.basic;

import java.util.Arrays;

public class refvsVal {
    public static void main(String[] args) {

        int x = 5;
        int y = x;

        System.out.println(x);
        System.out.println(y);

        y++;

        System.out.println(x);
        System.out.println(y);

        int[] arr1 = new int[5];
        int[] arr2 = arr1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2[0] = 1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        // both arrays value will be changed because they are using the same memory
        arr2 = new int[] {4, 5, 6, 7, 8};
        modifyArray(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
