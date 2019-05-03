package com.robot.service.impl;


import com.robot.dao.UserDao;
import com.robot.entry.User;
import com.robot.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    protected Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public boolean login(String name, String pwd) {
        if (StringUtils.isBlank(name) || StringUtils.isBlank(pwd)) {
            return false;
        }
        User user = userDao.selectOne(name);
        if (user.getPwd().equals(pwd)) {
            return true;
        }
        return false;
    }
}
