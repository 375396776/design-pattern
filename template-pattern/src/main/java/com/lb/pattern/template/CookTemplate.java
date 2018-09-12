package com.lb.pattern.template;

/**
 * @author lb
 * @Title: CookTemplate
 * @Description: TODO
 * @date 2018/09/12  10:50
 */
public abstract class CookTemplate {
    void doDish(){
        washPan();
        putOil();
        putFoodMaterial();
        fry();
        outPan();
    }
    void washPan(){
        System.out.println("刷锅");
    }
    void putOil(){
        System.out.println("倒油");
    }
    abstract void putFoodMaterial();
    void fry(){
        System.out.println("炒啊炒啊炒啊炒");
    }
    void outPan(){
        System.out.println("出锅了，一盘可口的饭菜");
    }
}
