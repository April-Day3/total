package com.sxw.test;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/2 21:37
 * @Version 1.0
 * 描述：   水仙花数
 */
public class test_narcissus {

    public static void main(String[] args) {

        for (int num = 101; num < 1000; num++){
            int bbb = num / 100;
            int bb = (num % 100) / 10;
            int b = (num % 100) % 10;
            if ((bbb * bbb * bbb + bb * bb * bb + b * b * b) == num) {
                System.out.println(num);
            }
        }
    }
}
