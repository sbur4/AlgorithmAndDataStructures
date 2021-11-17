package Test.Fibonachi;

public class Fibo1 {
    public static void main(String[] args) {
        System.out.println(fiboNaive(3));
        System.out.println(fiboNaive(5));
        System.out.println(fiboNaive(10));

        System.out.println(fiboEffective(10));
        System.out.println(fiboEffective(100));
    }

    private static long fiboNaive(int n) {
        if (n <= 1) {
            return n;
        }
        return fiboNaive(n - 1) + fiboNaive(n - 2);
    }

    private static long fiboEffective(int n) {
        long[] fiboArr = new long[n + 1];
        fiboArr[0] = 0;
        fiboArr[1] = 1;
        for (int i = 2; i <= n; i++) {
            fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2];

        }
        return fiboArr[n];
    }
}
