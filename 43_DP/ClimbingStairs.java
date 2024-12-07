public class ClimbingStairs {

    //SIMPLE RECURSION
    // public static int countWays(int n) { //O(2^n)
    //     if(n==0) return 1;
    //     if(n<0) return 0;

    //     return countWays(n-1)+countWays(n-2);
    // }
  
    //MEMOIZATION
    public static int countWays(int n, int dp[]) { //O(n)
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0) return dp[n];

        return dp[n] = countWays(n-1)+countWays(n-2);
    }

    //TABULATION
    public static int countWays(int n) { //O(n)
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1) dp[i] = 1;
            else {
                dp[i] = dp[i-1]+dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n=5;
        int dp[] = new int[n+1];
        System.out.println(countWays(n));
        System.out.println(countWays(n, dp));
    }
     
}
