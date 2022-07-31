package arrayLeftRotation;

import java.util.Arrays;

public class ArrayLeftRotation5 {
    private static int[] leftRotate(int[] ar, int d) {
        int n = ar.length, i, j;
        if (d == 0 || d == n)
            return null;
        if (d > n)
            d = d % n;

        i = d;
        j = n - d;

        while (i != j) {
            if (i < j) {
                swap(ar, d - i, d + j - i, i);
                j -= i;
            } else {
                swap(ar, d - i, d, j);
                i -= j;
            }
        }
        swap(ar, d - i, d, i);
        return ar;
    }

    private static void swap(int[] ar, int fi, int si, int d) {
        int i, temp;
        for (i = 0; i < d; i++) {
            temp = ar[fi + i];
            ar[fi + i] = ar[si + i];
            ar[si + i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 7;
        System.out.println("Rotated array: " + Arrays.toString(leftRotate(ar, d)));
    }
}