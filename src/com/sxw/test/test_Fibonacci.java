package com.sxw.test;
import java.util.Scanner;

// 递归思想

public class test_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(true) {
            System.out.println("请输入需要查询第几个月的兔子数（退出输入0）:");
            int month = scanner.nextInt();
            int num = f(month);//加入递归循环，将得到的数给num
            System.out.println("兔子数是:"+num);
        }
    }

    //递归
    private static int f(int month ) {
        if(month ==1 || month == 2) {//如果是第一月和第二月就输出1只兔子
            return 1;
        }else {//否则就进入递归
            return f(month-1)+f(month-2);//f(month)=f(month-1)+f(month-2)
        }
    }
}