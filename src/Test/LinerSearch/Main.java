package Test.LinerSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 8, 3, 9, 5};
        int k = 3;
        System.out.println(search(arr, k));
    }

    public static int search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
