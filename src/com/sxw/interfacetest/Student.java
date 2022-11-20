package com.sxw.interfacetest;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 21:59
 * @Version 1.0
 * 描述：   TODO
 */
public class Student {

    //学生做课堂作业练习，并告诉老师
    public void doPractice(BackInterface backInterface){
        System.out.println("学生做练习。。");
        System.out.println("学生告诉老师做完练习。。。");
        backInterface.backMethod();
    }
}
