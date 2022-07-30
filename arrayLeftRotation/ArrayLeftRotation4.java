package arrayLeftRotation;

import java.util.Arrays;

public class ArrayLeftRotation4 {
    private static int[] leftRotate(int[] ar, int d) {
        int n = ar.length;
        if (d == 0) {
            return null;
        }
        d %= n;
        reverseArray(ar, 0, d - 1);
        reverseArray(ar, d, n - 1);
        reverseArray(ar, 0, n - 1);

        return ar;
    }

    private static void reverseArray(int[] ar, int start, int end) {
        int temp = -1;
        if (start > end) {
            return;
        }
        temp = ar[start];
        ar[start] = ar[end];
        ar[end] = temp;
        reverseArray(ar, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int d = 3;
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        System.out.println("Rotated Array: " + Arrays.toString(leftRotate(ar, d)));
    }
}
