public class Fibonacci {
    private static final int MOD = (int) (1e9 + 7);

    public int getFibb(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i < n; i++) {
            int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        return a;
    }
}
