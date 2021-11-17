package Test.BigO;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursFunction(1));
        System.out.println(recursFunction(3));
        System.out.println("\n");
        System.out.println(lineFunction(1));
        System.out.println(lineFunction(2));
    }

    //speed O(N)
    private static int recursFunction(int n) {
        if (n == 1) {
            return 1;
        }
        return n + lineFunction(n - 1);
        //3+(3-1) =5
        //+(2-1) =6
    }

    //speed O(1)
    private static int lineFunction(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += add(i, i + 1);
        }
        return sum;
        //0+1=1
        //1+2=3
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
