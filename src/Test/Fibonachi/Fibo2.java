package Test.Fibonachi;

import java.util.Arrays;

//memozation
public class Fibo2 {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fiboNaive(n, mem));
    }

    private static long fiboNaive(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }
        long res = fiboNaive(n - 1, mem) + fiboNaive(n - 2, mem);
        mem[n] = res;
        return res;
    }
}
