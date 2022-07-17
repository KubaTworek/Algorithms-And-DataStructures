package pl.pjatk;

import algorithms.SearchingAlgorithms;
import algorithms.SortingAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {3,35,-23,1,46,-90};
        int[] arr2 = {3,35,-23,1,46,-90};
        int[] arr3 = {3,35,-23,1,46,-90};
        int[] arr4 = {3,35,-23,1,46,-90};
        int[] arr5 = {3,35,-23,1,46,-90};
        int[] arr6 = {3,35,-23,1,46,-90};
        int[] arr7 = {3,5,1,1,8,2,10,2};
        int[] arr8 = {2564,8136,3410,3156,9265,3850};
        int[] arr9 = {3,35,-23,1,46,-90};

        SortingAlgorithms.bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        SortingAlgorithms.selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        SortingAlgorithms.countingSort(arr7);
        System.out.println(Arrays.toString(arr7));

        System.out.println("Index of 35 is: " + SearchingAlgorithms.getIndexOfValueLinear(arr1, 35));
        System.out.println("Index of 35 is: " + SearchingAlgorithms.getIndexOfValueBinary(arr1, 35));



    }
}
