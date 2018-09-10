package com.lb.pattern.proxy.customized;


import com.lb.pattern.proxy._static.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Tom on 2018/3/10.
 */
public class CustomMeipo implements GPInvocationHandler {

    //被代理的对象，把引用给保存下来
    private Person target;

    public Object getInstance(Person target) throws Exception{
        this.target = target;

        Class<?> clazz = target.getClass();

        //下半截，老师深入底层来给大家讲解字节码是如何重组的
        //用来生成一个新的对象（字节码重组来实现）
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是中介，这是我工作钱前做的准备");

        method.invoke(this.target,args);

        System.out.println("中介的工作完成，希望下次还来找我");

        return  null;
    }
}
