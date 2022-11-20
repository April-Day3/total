package com.sxw.test;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/2 21:47
 * @Version 1.0
 * 描述：   猴子吃桃
 */
public class Test_Monkey {

    public static void main(String[] args) {

        int lastdayNum = 1;
        for (int i = 2; i <= 10; i++) {
            lastdayNum = (lastdayNum + 1) * 2;
        }
        System.out.println("猴子第一天摘了 " + lastdayNum + " 个桃子");

    }
}
