package com.sxw.sort;

public class sort01 {
    //定义一个main方法
    public static void main(String[] args) {

        int [][] arr = new int [10][];
        for (int i =0; i < arr.length; i++){ //遍历arr的每个元素
            //给每个一维数组开辟空间
            arr[i] = new int[i + 1];
            // 给每个一维数组赋值
            for (int j = 0; j < arr[i].length; j++){
                if (j == 0 || j == arr[i].length - 1){
                    arr[i][j] = 1;
                } else { //中间的元素
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        //输出杨辉三角
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
