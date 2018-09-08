package com.lb.pattern.singleton.hungry;

/**
 * @author lb
 * @Title: HungrySingleton
 * @Description: TODO
 * @date 2018/09/07  16:23
 */
public class HungrySingleton {

    /**
     * 线程安全的单例
     */
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    /**
     * 饿汉变种模式
     */
//    private HungrySingleton hungrySingleton = null;
//
//    static {
//        hungrySingleton = new HungrySingleton();
//    }
//
//    private HungrySingleton(){}
//
//    public static HungrySingleton getInstance(){
//        return hungrySingleton;
//    }
}
