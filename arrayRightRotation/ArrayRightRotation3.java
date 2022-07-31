package arrayRightRotation;

import java.util.Arrays;

public class ArrayRightRotation3 {
    private static int[] rightRotate(int[] ar, int d) {
        int n = ar.length, i, j;
        if (d == 0 || d == n)
            return ar;
        if (d > n)
            d = d % n;
        int dComp = n - d;
        dComp %= n;
        i = dComp;
        j = n - dComp;

        while (i != j) {
            if (i < j) {
                swap(ar, dComp - i, dComp + j - i, i);
                j -= i;
            } else {
                swap(ar, dComp - i, dComp, j);
                i -= j;
            }
        }
        swap(ar, dComp - i, dComp, i);
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
        int[] ar = { 6, 1, 3, 8, 4, 5, 2 };
        int d = 3;
        System.out.println("Rotated array: " + Arrays.toString(rightRotate(ar, d)));
    }
}
