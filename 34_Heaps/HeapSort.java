public class HeapSort {

    public static void heapify(int arr[], int i, int size) {
        //----MaxHeap Logic-----------------
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if(left<size && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }

        if(right<size && arr[right] > arr[left]) {
            maxIdx = right;
        }

        if(maxIdx!=i) {
            //swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]) {
        //step 1 - build maxHeap
        int n = arr.length;
        for(int i=n/2; i>=0; i--) { //O(n*logn)
            heapify(arr, i, n);
        }

        //step 2 - push largest at end
        for(int i=n-1; i>=0; i--){ //O(n*logn)
            //swap (largest-(first with last))
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);//MaxHeap logic
        }
    }

    public static void main(String[] args) {
        // int arr[] = {5,7,2,3,5,5};
        int arr[] = {4,1,3,9,7};
        heapSort(arr);

        //print
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
