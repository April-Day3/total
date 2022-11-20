package com.sxw.proxy;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 8:44
 * @Version 1.0
 * 描述：   TODO
 */
public class test {
    public static void main(String[] args) {
        JDKProxy jdkProxy = new JDKProxy();
        UserManager userManagerJDK  = (UserManager) jdkProxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("tom", "root");
    }
}
