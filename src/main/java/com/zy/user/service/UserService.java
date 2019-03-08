package com.zy.user.service;

import com.zy.user.pojo.User;

import java.util.List;

public interface UserService {


    void delByIds(String ids);

    void delById(Integer id);

    void upUser(User user);

    void addUser(User user);

    List<User> getUser();

    User getUserOne();
}
