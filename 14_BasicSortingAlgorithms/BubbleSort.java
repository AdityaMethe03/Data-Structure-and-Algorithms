public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap=0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0 & turn==0){
                System.out.println("Array already sorted");
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr1[] = {5,4,1,3,2};
        int arr2[] = {1,2,3,4,5};

        bubbleSort(arr1);
        printArr(arr1);

        bubbleSort(arr2);
        printArr(arr2);
    }
}
