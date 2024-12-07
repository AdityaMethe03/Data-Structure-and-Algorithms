import java.util.*;

public class MaxLenChainPairs {
    public static void main(String[] args) {
        int pairs[][] = {{1,2},{2,3},{3,4}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int end = pairs[0][1];
        int count = 1;
        for(int i=1; i<pairs.length; i++) {
            if(end < pairs[i][0]){ //i.e. end of last selected is < start of next
                count++;
                end = pairs[i][1];
            }
        }

        System.out.println(count);
    }
}
