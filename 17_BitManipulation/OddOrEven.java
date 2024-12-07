public class OddOrEven {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(8);
        oddOrEven(11);
    }
}
