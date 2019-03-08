package com.zy.user.service.impl;

import com.zy.user.dao.UserDao;
import com.zy.user.pojo.User;
import com.zy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserDao dao;
    @Override
    public void delByIds(String ids) {
        dao.delByIds(ids);
    }

    @Override
    public void delById(Integer id) {
         dao.delById(id);
    }

    @Override
    public void upUser(User user) {
        dao.upUser(user);
    }

    @Override
    public void addUser(User user) {
        dao.addUser( user);
    }

    @Override
    public List<User> getUser() {
        return dao.getUserAll();
    }

    @Override
    public User getUserOne() {
        return dao.getUserOne();
    }
}
