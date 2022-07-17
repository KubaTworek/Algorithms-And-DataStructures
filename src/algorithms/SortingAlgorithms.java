package algorithms;

public class SortingAlgorithms {

    public static void bubbleSort(int[] arr){
        for(int ignored : arr){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        int lastIndex = arr.length-1;
        for(int ignored : arr){
            int maxIndex = 0;
                for(int i=0; i<lastIndex; i++){
                    if(arr[maxIndex] < arr[i+1]){
                        maxIndex = i+1;
                    }
                }
            swap(arr, maxIndex, lastIndex);
            lastIndex--;
        }
    }

/*    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i] < arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }*/

    public static void shellSort(int[] arr){

    }

    public static void mergeSort(int[] arr){

    }

    public static void quickSort(int[] arr){

    }

    public static void countingSort(int[] arr){
        int[] arrTemp = {0,0,0,0,0,0,0,0,0,0};
        for (int k : arr) {
            for (int j = 0; j < arrTemp.length; j++) {
                if (k == j + 1) {
                    arrTemp[j]++;
                }
            }
        }
        int index = 0;
        for(int i=0; i<arrTemp.length; i++){
            for(int j=0; j<arrTemp[i]; j++){
                arr[index++] = i+1;
            }
        }
    }

    public static void radixSort(int[] arr){

    }

    public static void bucketSort(int[] arr){

    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
