package arrayRightRotation;

import java.util.Arrays;

public class ArrayRightRotation1 {
    private static int[] rightRotateArray(int[] ar, int d) {
        int n = ar.length, k, i, j, temp, gcd = 0;
        d %= n;
        gcd = gcd(n, d);

        for (i = 0; i < gcd; i++) {
            temp = ar[i];
            j = i;
            while (true) {
                k = (j + n - d /* For Right Rotation, d simple becomes n - d */);
                if (k >= n) {
                    k -= n;
                }
                if (k == i) {
                    break;
                }
                ar[j] = ar[k];
                j = k;
            }
            ar[j] = temp;
        }
        return ar;
    }

    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        int d = 3;
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        System.out.println("Rotated Array: " + Arrays.toString(rightRotateArray(ar, d)));
    }
}
