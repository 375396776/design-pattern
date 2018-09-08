package com.lb.pattern.singleton.seriable;

import java.io.Serializable;

/**
 * @author lb
 * @Title: SeriableSingleton
 * @Description: TODO
 * @date 2018/09/07  16:34
 */
public class SeriableSingleton implements Serializable {

    private static final SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    /**
     * 保证反序列化之后还是同一个对象
     * @return
     */
    private  Object readResolve(){
        return  seriableSingleton;
    }

}
