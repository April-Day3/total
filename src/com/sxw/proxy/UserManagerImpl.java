package com.sxw.proxy;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 8:30
 * @Version 1.0
 * 描述：   接口实现类
 */
public class UserManagerImpl implements UserManager{

    @Override
    public void addUser(String id, String password) {
        System.out.println("调用了UserManagerImpl.addUser()方法");
    }

    @Override
    public void delUser(String id) {
        System.out.println("调用了UserManagerImpl.delUser()方法");
    }
}
