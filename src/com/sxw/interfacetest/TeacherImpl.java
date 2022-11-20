package com.sxw.interfacetest;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/4 21:58
 * @Version 1.0
 * 描述：   TODO
 */
public class TeacherImpl implements BackInterface{

    //传一个学生的引用
    private Student student;

    public TeacherImpl(Student student) {
        this.student = student;
    }

    //老师告诉学生做课堂作业
    public void doEvent(){
        System.out.println("老师让学生做练习");
        //student.doPractice(this);
        new Thread(new Runnable() {
            @Override
            public void run() {
                student.doPractice(TeacherImpl.this::backMethod);
            }
        }).start();
    }
    @Override
    public void backMethod() {
        System.out.println("老师接收到学生做完课堂作业的消息");

    }
}
