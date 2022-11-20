package com.sxw.search;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 15:45
 * @Version 1.0
 * 描述：   插入排序
 */
public class InsertSort {

    private  InsertSort(){}

    public static <E extends Comparable<E>>void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {

            //将arr[i]插入到合适的位置
            for (int j = 0; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
        private static <E> void swap(E[] arr, int i, int j){

                E t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
        }

    public static void main(String[] args) {

        Integer[] dataSize = {1000,10000};
        for (Integer e: dataSize) {
        }
    }
}
