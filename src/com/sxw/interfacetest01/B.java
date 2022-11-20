package com.sxw.interfacetest01;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 22:33
 * @Version 1.0
 * 描述：   TODO
 */
public class B {
    public static void main(String[] args) {
        A a = new A();
        a.setc(new A.C() {
            @Override
            public int get(int i) {
                return i;
            }
        });
        a.print();
    }
}
