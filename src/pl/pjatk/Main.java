package pl.pjatk;

import algorithms.SortingAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,35,-23,1,46,-90};

        SortingAlgorithms.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
