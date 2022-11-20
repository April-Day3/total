package com.sxw.search;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 11:54
 * @Version 1.0
 * 描述：   线性查找
 */
public class LinearSearch {

    private LinearSearch(){}
    public static <E> int search(int[] data, int target){

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {24,34,43,56,43,22,23};
        int res = LinearSearch.search(data, 23);
        System.out.println(res);
    }
}
