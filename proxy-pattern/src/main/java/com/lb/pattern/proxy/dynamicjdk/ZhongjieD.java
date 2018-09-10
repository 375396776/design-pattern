package com.lb.pattern.proxy.dynamicjdk;

import com.lb.pattern.proxy._static.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lb
 * @Title: ZhongjieD
 * @Description: TODO
 * @date 2018/09/10  17:12
 */
public class ZhongjieD implements InvocationHandler {

    //被代理的对象，把引用给保存下来
    private Person target;

    public Object getInstance(Person target) throws Exception{
        this.target = target;

        Class<?> clazz = target.getClass();

        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房子前的准备");
        method.invoke(this.target,args);
        System.out.println("买房子后的装修");
        return null;
    }
}
