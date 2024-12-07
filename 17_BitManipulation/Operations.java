public class Operations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n&bitMask) ==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    public static int updateIthBit(int n,int i, int newBit) {
//        if(newBit == 0){
//            return clearIthBit(n, i);
//        }else{
//            return setIthBit(n, i);
//        }

        //another method
        n = clearIthBit(n ,i);
        int BitMask = newBit<<i;
        return n | BitMask;

    }

    public static int clearBits(int n, int i){
        int bitMask = (~0)<<i;
//        Or
//         int bitMask = (-1)<<i;
        return n & bitMask;
    }
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {

        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(10, 1));

        System.out.println(setIthBit(10, 2));
        System.out.println(setIthBit(10, 3));

        System.out.println(clearIthBit(10, 1));

        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(updateIthBit(10, 1, 0));

        System.out.println(clearBits(31, 3));//clear i bits

        System.out.println(clearBitsInRange(10, 2, 4));

        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(7));

        int x = 6;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
}
