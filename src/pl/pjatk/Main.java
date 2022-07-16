package pl.pjatk;

import algorithms.SortingAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {3,35,-23,1,46,-90};
        int[] arr2 = {3,35,-23,1,46,-90};

        SortingAlgorithms.bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        SortingAlgorithms.selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
