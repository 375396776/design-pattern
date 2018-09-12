package com.lb.pattern.adapter;

import com.lb.pattern.adapter.SignIn;
import com.lb.pattern.adapter.entity.ResultMsg;

/**
 * @author lb
 * @Title: ThirdSignIn
 * @Description: TODO
 * @date 2018/09/12  16:46
 */
public class ThirdSignIn extends SignIn {

    public ResultMsg loginForQQ(String openId){
        //1、openId是全局唯一，我们可以把它当做是一个用户名(加长)
        //2、密码默认为empty
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登录方法

        super.regis(openId,"empty");
        return super.login(openId, "empty");
    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        return  null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){

        return null;
    }

}
