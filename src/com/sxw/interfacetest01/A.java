package com.sxw.interfacetest01;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 22:31
 * @Version 1.0
 * 描述：   TODO
 */
public class A {
    private C c = null;

    interface C {
        int get (int i);
    }

    public void setc(C c){
        this.c = c;
    }

    public void print(){
        System.out.println(c.get(10));
    }
}
