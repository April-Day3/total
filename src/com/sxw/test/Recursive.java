package com.sxw.test;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {

        Tools tools = new Tools();
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.print("请输入day:");
            int day = scanner.nextInt();
            int peachNum = tools.peach(day);
            if (peachNum != -1) {
                System.out.println("第"+day+"天有"+peachNum+"个桃子");
            }
        }

    }
}
/*
思路分析 逆推
1.day = 10 时，有 1 个桃子
2.day = 9 时，有（day10+1）*2 个桃子
3.day = 8 时，有（day9+1）*2 个桃子
……
*/
class Tools {
    public int peach(int day){
        if (day == 10){
            return 1;
        } else if (day >=1 && day <=9){
            return (peach(day+1)+1)*2;
        } else {
            System.out.println("day在1~10之间");
            return -1;
        }
    }
}