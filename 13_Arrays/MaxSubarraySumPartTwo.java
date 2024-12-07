public class MaxSubarraySumPartTwo {
    public static void printSubarrays(int numbers[]) {

        //these subarrays are continuous pairs in array

        int ts=0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; //careful with the logic(cause it's correct)
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            //calculate prefix array
            prefix[i] = prefix[i-1] + numbers[i];

        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max is: " + maxSum);
    }
    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10};
        int numbers[] = {1,-2,6,-1,3};

        printSubarrays(numbers);
    }
}
