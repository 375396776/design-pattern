package com.lb.pattern.adapter;

import org.junit.Test;

/**
 * @author lb
 * @Title: AdapterTest
 * @Description: TODO
 * @date 2018/09/12  16:55
 */
public class AdapterTest {

    @Test
    public void testThirdSignIn(){
        ThirdSignIn thirdSignIn = new ThirdSignIn();
        thirdSignIn.loginForQQ("libin123456789");
    }
}
