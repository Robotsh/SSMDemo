package com.robot.service;


import com.robot.entry.User;


public interface UserService {


    /**
     * 登录
     * @param Name
     * @param Pwd
     * @return
     */
    boolean login(String Name, String Pwd);
}
