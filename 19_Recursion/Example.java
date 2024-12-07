public class Example {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s = n + sum(n-1);
        return s;
    }

    public static int fib(int n){
        if(n == 0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    } 

    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){
        if(i== arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound ==-1 && arr[i]==key){
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n){//O(n)
        if(n==0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        return x * power(x,n-1);
    }

    public static int optimizedPower(int a, int n){//O(log n)
        if(n==0){
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2!=0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(5));
        printDec(n);
        printInc(n);
        System.out.println();
        System.out.println(sum(n));
        System.out.println(fib(25));
        int arr1[] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr1, 0));
        int arr2[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr2, 5, 0));
        System.out.println(lastOccurence(arr2, 5, 0));
        System.out.println(power(2,10));
        System.out.println(optimizedPower(2,10));
    }
}
