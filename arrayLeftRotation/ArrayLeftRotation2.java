package arrayLeftRotation;

import java.util.Arrays;

public class ArrayLeftRotation2 {
    private static int[] rotateArray(int[] ar, int d) {
        int p = 1, i, n = ar.length;
        while (p <= d) {
            int temp = ar[0];
            for (i = 0; i < n - 1; i++) {
                ar[i] = ar[i + 1];
            }
            ar[n - 1] = temp;
            p++;
        }
        return ar;
    }

    public static void main(String[] args) {
        int d = 2;
        int ar[] = { 4, 5, 6, 7, 8 };
        System.out.println("Rotated Array: " + Arrays.toString(rotateArray(ar, d)));
    }
}
