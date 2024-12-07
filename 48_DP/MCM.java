import java.util.Arrays;

public class MCM {
    public static int matrixChainMulti(int arr[], int i, int j) {
        if(i==j) {
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j; k++) {
            int cost1 = matrixChainMulti(arr, i, k);//Ai...Ak => arr[i-1]xarr[k]
            int cost2 = matrixChainMulti(arr, k+1, j);//Ak+1...Aj => arr[k]xarr[j]
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans, finalCost);
        }

        return ans; //minCost
    }

    public static int memoization(int arr[], int i, int j, int dp[][]) {
        if(i==j) {
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];

        int ans=Integer.MAX_VALUE;
        for(int k=i; k<j; k++) {
            int cost1 = memoization(arr, i, k, dp);
            int cost2 = memoization(arr, k+1, j, dp);
            int cost3 = arr[i-1]*arr[k]*arr[j];
            int finalCost = cost1+cost2+cost3;
            ans = Math.min(ans, finalCost);
        }

        return dp[i][j] = ans; 
    }

    public static int tabulation(int arr[]) {
        int n=arr.length;
        int dp[][] = new int[n][n];
        
        //initialization
        for(int i=0; i<n; i++) {
            dp[i][i] = 0;
        }

        //bottom-ep sol
        for(int len=2; len<=n-1; len++) {
            for(int i=1; i<=n-len; i++) {
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        print(dp);
        return dp[1][n-1];
    }

    public static void print(int dp[][]) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[i].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        int n = arr.length;
        
        // System.out.println(matrixChainMulti(arr, 1, n-1));
        
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(memoization(arr, 1, n-1, dp));

        System.out.println(tabulation(arr));
    }
}
