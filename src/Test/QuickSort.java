package Test;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {13, 18, 27, 2, 19, 25};
        int n = a.length;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(quickSort(a, 0, n - 1)));
    }

    private static int[] quickSort(int[] a, int start, int end) {
        if (start < end) {
            int p = partition(a, start, end);
            quickSort(a, start, p - 1);
            quickSort(a, p + 1, end);
        }
        return a;
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int i = (start - 1);

        for (int j = start; j <= end - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[i + 1];
        a[i + 1] = a[end];
        a[end] = t;
        return (i + 1);
    }
}
