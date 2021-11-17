package Test.Greedy;

import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 9, 9, 5};
        System.out.println(findMax(arr));
    }

    private static String findMax(int[] arr) {
//        Arrays.sort(arr);
//        String res = "";
//        for (int i = arr.length - 1; i >= 0; --i) {
//            res += arr[i];
//        }
//        return res;
        return String.join("", Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
}
