package com.sxw.clone;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 8:19
 * @Version 1.0
 * 描述：   TODO
 */
public class Dome {
    public static void main(String[] args) throws CloneNotSupportedException {
        User userOne, userTwo, userThree;
        userOne = new User("username", "password");
        userTwo = userOne;
        userThree = (User) userOne.clone();

        System.out.println(userTwo == userOne);
        System.out.println(userTwo.equals(userOne));

        System.out.println(userThree == userOne);
        System.out.println(userThree.equals(userOne));
    }
}
