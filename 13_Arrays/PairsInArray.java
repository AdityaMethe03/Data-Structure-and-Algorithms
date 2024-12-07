public class PairsInArray {
    public static void printSubarrays(int numbers[]) {

        int ts=0;
        int max = Integer.MIN_VALUE; //careful with the logic(cause it's correct)
        int min = Integer.MAX_VALUE; //careful with the logic(cause it's correct)

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];

                    if(min>sum){
                        min=sum;
                    }
                    if(max<sum){
                        max=sum;
                    }

                }
                ts++;
                System.out.print(" = " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);
        System.out.println("total subarray = " + ts);
    }
    public static void main(String[] args) {
//        int numbers[] = {2,4,6,8,10};
        int numbers[] = {1,-2,6,-1,3};

        printSubarrays(numbers);
    }
}
