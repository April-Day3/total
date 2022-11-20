package com.sxw.interfacetest;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 22:08
 * @Version 1.0
 * 描述：   TODO
 */
public class BackDemo {
    public static void main(String[] args) {
        TeacherImpl teacher = new TeacherImpl(new Student());
        teacher.doEvent();
    }
}
