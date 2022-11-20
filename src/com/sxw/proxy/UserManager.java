package com.sxw.proxy;

/**
 * @Author Frank
 * @project HomeWork
 * @Date 2022/11/5 8:29
 * @Version 1.0
 * 描述：   目标接口类
 */
public interface UserManager {
    void addUser(String id, String password);
    void delUser(String id);
}
