package com.sxw.search;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 15:08
 * @Version 1.0
 * 描述：   选择排序
 */
public class SelectionSort {

    private SelectionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
                 swap(arr,i,minIndex);
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {

        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 4, 5, 6, 8};
        SelectionSort.sort(arr);
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
