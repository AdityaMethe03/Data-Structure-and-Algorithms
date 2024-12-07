public class Fibonnaci {
    //MEMOIZATION
    // public static int fib(int n, int f[]) {
    //     if(n==0 || n==1) {
    //         return n;
    //     }
    //     if(f[n]!=0) { //fib(n) is already calculated
    //         return f[n];
    //     }
    //     return f[n] = fib(n-1, f) + fib(n-2, f);
    // }

    //TABULATION
    public static int fib(int n) {
        int dp[] = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    //SIMPLE RECURSION
    // public static int fib(int n) {
    //     if(n==0 || n==1) {
    //         return n;
    //     }
    //     return fib(n-1) + fib(n-2);
    // }
    public static void main(String[] args) {
        int n=5;
        int f[] = new int[n+1];
        System.out.println(fib(n));
        // System.out.println(fib(n, f));
    }

}
