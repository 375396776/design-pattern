package com.lb.pattern.proxy.cglib;

import com.lb.pattern.proxy._static.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lb
 * @Title: ZhongjieC
 * @Description: TODO
 * @date 2018/09/10  17:52
 */
public class ZhongjieC implements MethodInterceptor {

    //被代理的对象，把引用给保存下来
    private Person target;

    public Object getInstance(Person target) throws  Exception{

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(this);

        return  enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("我是中介，这是我工作钱前做的准备");
        methodProxy.invokeSuper(o,objects);
        System.out.println("中介的工作完成，希望下次还来找我");
        return null;
    }

}
