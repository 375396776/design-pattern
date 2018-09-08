package com.lb.pattern.singleton.inner;

/**
 * @author lb
 * @Title: InnerClassSingleton
 * @Description: TODO
 * @date 2018/09/09  00:28
 */
public class InnerClassSingleton {

    private static class SingletonHolder{
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static final InnerClassSingleton getInstance() {
        return SingletonHolder.innerClassSingleton;
    }
}
