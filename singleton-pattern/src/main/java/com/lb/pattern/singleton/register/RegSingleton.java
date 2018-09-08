package com.lb.pattern.singleton.register;

/**
 * @author lb
 * @Title: RegSingleton
 * @Description: 登记式单例实际上维护的是一组单例类的实例，将这些实例存储到一个Map(登记簿)
 * 中，对于已经登记过的单例，则从工厂直接返回，对于没有登记的，则先登记，而后返回
 * @date 2018/09/07  17:04
 */


import java.util.HashMap;
import java.util.Map;

public class RegSingleton {
    /**
     * 登记簿，用来存放所有登记的实例
     */
    private static Map<String, RegSingleton> map = new HashMap<String, RegSingleton>();
    //在类加载时添加一个实例到登记簿
    static{
        RegSingleton singleton = new RegSingleton();
        map.put(singleton.getClass().getName(), singleton);//运用了反射
    }
    /**
     * 受保护的默认构造方法
     */
    protected RegSingleton() {

    }
    /**
     * 静态工厂方法，返回指定登记对象的唯一实例
     * 对于已经登记的直接取出返回，对于还未登记的先登记，然后取出返回
     *
     */
    public static RegSingleton getInstance(String name){
        if(name==null){
            name="RegSingleton";
        }
        if(map.get(name)==null){
            try {
                map.put(name, (RegSingleton) Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

    /**
     * 一個示意性的商业方法
     */
    public String about(){
        return "Hello,I am RegSingleton";
    }
}
