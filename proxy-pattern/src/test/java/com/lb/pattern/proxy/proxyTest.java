package com.lb.pattern.proxy;

import com.lb.pattern.proxy._static.Person;
import com.lb.pattern.proxy._static.Xiaoming;
import com.lb.pattern.proxy._static.Zhongjie;
import com.lb.pattern.proxy.cglib.Xiaoliang;
import com.lb.pattern.proxy.cglib.ZhongjieC;
import com.lb.pattern.proxy.customized.CustomMeipo;
import com.lb.pattern.proxy.dynamicjdk.XiaoGang;
import com.lb.pattern.proxy.dynamicjdk.ZhongjieD;
import org.junit.Test;

/**
 * @author lb
 * @Title: proxyTest
 * @Description: TODO
 * @date 2018/09/10  17:06
 */
public class proxyTest {
    @Test
    public void testStaticProxy(){
        Xiaoming xiaoming = new Xiaoming();
        Zhongjie zhongjie =new Zhongjie(xiaoming);
        zhongjie.buyHouse();
    }
    @Test
    public void testDynamicProxy(){

        try {
            Person xiaoGang = (Person)new ZhongjieD().getInstance(new XiaoGang());
            System.out.println(xiaoGang.getClass());
            xiaoGang.buyHouse();
            xiaoGang.buyCar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testCGLIBProxy(){
        try {
            Person xiaoliang = (Person)new ZhongjieC().getInstance(new Xiaoliang());
            xiaoliang.buyCar();
            System.out.println(xiaoliang.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testCustom(){
        try {
            Person xiaoliang = (Person)new CustomMeipo().getInstance(new Xiaoliang());
            System.out.println(xiaoliang.getClass());
            xiaoliang.buyCar();
            xiaoliang.buyHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
