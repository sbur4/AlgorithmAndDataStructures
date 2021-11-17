package Test.BinarySearch;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{-1, 3, 5, 8, 10, 15, 16, 20}, 3));
    }

    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
