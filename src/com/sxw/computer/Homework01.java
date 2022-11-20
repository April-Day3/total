package com.sxw.computer;

import java.util.Scanner;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/7 16:57
 * @Version 1.0
 * 描述：
 *      给定两个字符串 s 和 t，它们只包含小写字母。字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。请找出在 t 中被添加的字母。
 */
public class Homework01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        scanner.close();
        getValue(s, t);
    }

    public static void getValue(String s, String t) {
        char[] charStringArray = t.toCharArray();

        for (int i = 0; i < charStringArray.length; i++) {

            String charString = String.valueOf(charStringArray[i]);

            if (!s.contains(charString)) {
                System.out.println(charString);
                break;
            } else {
                s = s.replaceFirst(charString, "");
            }
        }
    }
}

