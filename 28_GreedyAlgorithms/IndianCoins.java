import java.util.ArrayList;
import java.util.Arrays;

public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 121;

        //----------METHOD 1---------------------------
        //if coins arr is not sorted
        // Arrays.sort(coins);

        // int count=0;
        // for(int i=coins.length-1; i>=0; i--) {
        //     if(coins[i] <= amount) {
        //         count += amount/coins[i];
        //         amount = amount%coins[i];

        //         if(amount == 0) {
        //             System.out.println(count);
        //             break;
        //         }
        //     }
        // }

        // System.out.println("remaining: "+amount);

        //----------------------METHOD 2---------------------------

        Arrays.sort(coins);
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;
        for(int i=coins.length-1; i>=0; i--) {
            if(coins[i] <= amount) {
                while(coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("Total coins used = " + count);

        for(int i=0; i<ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
