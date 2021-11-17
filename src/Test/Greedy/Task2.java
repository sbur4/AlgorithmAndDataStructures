package Test.Greedy;

public class Task2 {
    public static void main(String[] args) {
        int[] staitions = {0, 200, 375, 550, 750, 950};
        int capacity = 400;
        System.out.println(minStops(staitions, capacity));
    }

    private static int minStops(int[] staitions, int capacity) {
        int res = 0;
        int currentStop = 0;
        while (currentStop < staitions.length - 1) {
            int nextStop = currentStop;
            while (nextStop < staitions.length - 1 && staitions[nextStop + 1] - staitions[currentStop] <= capacity) {
                nextStop++;
            }
            if (currentStop == nextStop) {
                return -1;
            }
            if (nextStop < staitions.length - 1) {
                res++;
            }
            currentStop = nextStop;
        }
        return res;
    }
}
