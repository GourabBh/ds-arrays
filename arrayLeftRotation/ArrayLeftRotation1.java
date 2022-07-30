package arrayLeftRotation;

import java.util.Arrays;

class ArrayLeftRotation {
    public static int[] rotateArray(int[] ar, int d) {
        int n = ar.length, temp[] = new int[n], k = 0, i;

        for (i = d; i < n; i++) {
            temp[k] = ar[i];
            k++;
        }

        for (i = 0; i < d; i++) {
            temp[k] = ar[i];
            k++;
        }

        for (i = 0; i < n; i++) {
            ar[i] = temp[i];
        }
        return ar;
    }

    public static void main(String[] args) {
        int d = 2, ar[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Rotated Array " + Arrays.toString(rotateArray(ar, d)));
    }
}