package com.sxw.test;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/2 21:34
 * @Version 1.0
 * 描述：   素数
 */
public class test_Prime {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean b = true;// 默认此数就素数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false; // 此数不是素数
                    break;
                }
            }
            if (b) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n素数的个数：" + count);
    }
}
