package algorithms;

import java.util.Arrays;

public class SearchingAlgorithms {
    public static int getIndexOfValueLinear(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static int getIndexOfValueBinary(int[] arr, int value){
        SortingAlgorithms.bubbleSort(arr);
        int start = 0; int end = arr.length-1;
        return binarySearch(arr,value,start,end);
    }

    private static int binarySearch(int[] arr, int value, int start, int end){
        int mid = (start+end)/2;
        if(value == arr[mid]){
            return mid;
        } else if (value < arr[mid]){
            return binarySearch(arr,value,start,mid);
        } else {
            return binarySearch(arr,value,mid,end);
        }
    }
}
