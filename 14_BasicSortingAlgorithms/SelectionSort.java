public class SelectionSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                //for sorted in increasing order
                if(arr[minPos] > arr[j]){
                    
                //& for sorted in decreasing order
                // if(arr[minPos] < arr[j]){
                    minPos = j;
                }

            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {5,4,1,3,2};
        int arr2[] = {1,2,3,4,5};

        selectionSort(arr1);
        printArr(arr1);

        selectionSort(arr2);
        printArr(arr2);
    }
}
