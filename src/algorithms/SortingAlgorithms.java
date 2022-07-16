package algorithms;

public class SortingAlgorithms {
    public static void helloAlgorithm(){
        System.out.println("Hello Algorithm");
    }

    public static void bubbleSort(int[] arr){
        for(int element : arr){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    swap(arr, i, i+1);
                }
            }
        }
    }

    private static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
