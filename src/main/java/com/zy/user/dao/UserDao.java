package com.zy.user.dao;

import com.zy.user.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    void delByIds( @Param("ids") String ids);

    void delById(Integer id);

    void upUser(User user);

    void addUser(User user);

    List<User> getUserAll();

    User getUserOne();
}
