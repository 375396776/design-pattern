package com.lb.pattern.adapter;

import com.lb.pattern.adapter.entity.ResultMsg;
import com.lb.pattern.adapter.entity.User;

/**
 * @author lb
 * @Title: com.lb.pattern.adapter.SignIn
 * @Description: TODO
 * @date 2018/09/12  16:32
 */
public class SignIn {

    public ResultMsg regis(String name,String pass){
        return new ResultMsg("200", "success",new User());
    }
    public ResultMsg login(String username,String password){
        System.out.println(new ResultMsg("200", "success",new User(username,password)));
//        System.out.println(new ResultMsg("200", "success",new User()).toString());
        return new ResultMsg("200", "success",new User(username,password));
    }
}
