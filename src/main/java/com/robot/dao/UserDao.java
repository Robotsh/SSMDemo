package com.robot.dao;


import com.robot.entry.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    /**
     *
     * @param name
     * @return
     */
    User selectOne(@Param("name") String name);

}
