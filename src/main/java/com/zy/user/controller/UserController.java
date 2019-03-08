package com.zy.user.controller;

import com.zy.user.pojo.User;
import com.zy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/UserManager")
public class UserController {

      @Autowired
    private UserService service;

      @RequestMapping("/toUserOne")
    public  String toUserOne(){
          return "user/user";

      }
    @RequestMapping("/toUserAll")
    public  String toUserAll(){
        return "user/user2";

    }

    @RequestMapping("/toTab")
    public String toTab(User user, Model model){
        model.addAttribute("user",user);
        return "user/tab";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUser(){
        return service.getUser();
    }
    @RequestMapping("/getUserOne")
    @ResponseBody
    public User getUserOne(){

        return service.getUserOne();
    }
    @RequestMapping("/addUser")
    @ResponseBody
    public Map<String, Object> addUser(User user){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            service.addUser(user);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }
    @RequestMapping("/upUser")
    @ResponseBody
    public Map<String, Object> upUser(User user){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            service.upUser(user);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }
    @RequestMapping("/delById")
    @ResponseBody
    public Map<String,Object> delById(Integer id){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            service.delById(id);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }
    @RequestMapping("/delByIds")
    @ResponseBody
    public Map<String,Object> delByIds(String ids){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            service.delByIds(ids);
            map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("success", false);
        }
        return map;
    }

}
