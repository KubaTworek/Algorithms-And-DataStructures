package algorithms;

import java.util.Arrays;

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

    public static void selectionSort(int[] arr){
        int lastIndex = arr.length-1;
        for(int element : arr){
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

    private static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
