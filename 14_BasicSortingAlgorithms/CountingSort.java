public class CountingSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int k=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[k] = i;
                k++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {5,4,1,3,2};
        int arr2[] = {1,2,3,4,5};

        int arr3[] = {1,4,1,3,2,4,3,7};

        countingSort(arr1);
        printArr(arr1);

        countingSort(arr2);
        printArr(arr2);

        countingSort(arr3);
        printArr(arr3);
    }
}
