package com.lb.pattern.factory.simplefactory;

import com.lb.pattern.factory.Huawei;
import com.lb.pattern.factory.Mobile;
import com.lb.pattern.factory.Nokia;
import com.lb.pattern.factory.Summung;

/**
 * @author lb
 * @Title: SimpleFactory
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  18:43
 */
public class SimpleFactory {

    public Mobile getMobile(String name){
        if("NOKIA".equals(name)){
            return new Nokia();
        }else if("SUMMUNG".equals(name)){
            return new Summung();
        }else if("HUAWEI".equals(name)){
            return new Huawei();
        }else{
            System.out.println("我不能生产这个商品");
            return  null;
        }
    }
}
