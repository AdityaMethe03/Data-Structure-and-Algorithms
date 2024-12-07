public class tilingProblem {
    
    public static int tilingProb(int n){ // 2 x n (floor size)

        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam (to choice)
        //vertical choice
        int fnm1 = tilingProb(n-1);

        //horizontal choice
        int fnm2 = tilingProb(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProb(5) );
    }
}
