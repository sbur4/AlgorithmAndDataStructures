package Test;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int a[] = {35, 10, 31, 11, 26};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(bubbleSort(a)));
    }

    private static int[] bubbleSort(int[] a) {
        int i, j, temp;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
