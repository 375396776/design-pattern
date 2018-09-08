package com.lb.pattern.singleton.lazy;

/**
 * @author lb
 * @Title: LazySingleton
 * @Description: TODO
 * @date 2018/09/07  15:56
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
//    private volatile static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    /**
     * 1、
     * 这是一种线程不安全的单例
     * @return
     */
//    public static LazySingleton getInstance(){
//        if(lazySingleton ==null){
//            return new LazySingleton();
//        }
//        return lazySingleton;
//    }

    /**
     * 2、
     * 添加 synchronized锁 实现线程安全，但是这总效率低，不推荐使用
     * @return
     */
    public static synchronized  LazySingleton getInstance(){
        if(lazySingleton ==null){
            return new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 3、
     * 双向检查锁（double checked locking pattern） 和 volatile 实现线程安全
     * 将 LazySingleton 声明成 volatile
     * private static volatile LazySingleton lazySingleton;
     *
     * @return
     */
//    public static synchronized  LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            synchronized (LazySingleton.class) {
//                if (lazySingleton == null) {
//                    return new LazySingleton();
//                }
//            }
//        }
//        return lazySingleton;
//    }


}
