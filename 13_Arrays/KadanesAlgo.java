import java.util.Arrays;

public class KadanesAlgo {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; //Max Sum
        int cs = 0;//Current Sum

        boolean isNumNeg = true;
        //This all Negative element in array condition is not in KADANE'S algo
        //We have to write it on our own
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>0){
                isNumNeg = false;
                break;
            }
        }

        if(isNumNeg==true){
            Arrays.sort(numbers);
            System.out.println("Our max subarray sum is: " + numbers[numbers.length-1]);
        }else{
            for(int i=0; i<numbers.length; i++){
                cs = cs + numbers[i];
                if(cs<0){
                    cs=0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("Our max subarray sum is: " + ms);
        }

    }

    public static void main(String[] args) {
        int numbers1[] = {-2,-3,4,-1,-2,1,5,-3};
        int numbers2[] = {-4,-5,-6,-1,-200,-355}; // All -ve Num array

        kadanes(numbers1);
        kadanes(numbers2);

    }
}
