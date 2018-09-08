package com.lb.pattern.prototype;

import org.junit.Test;

/**
 * @author lb
 * @Title: PrototypeTest
 * @Description: TODO
 * @date 2018/09/09  01:41
 */
public class PrototypeTest {
    @Test
    public void testPrototype(){
        Prototype p = new Prototype();
        try {
            Prototype clone = (Prototype)p.clone();

//            int size = p.list.size();
//            int size1 = clone.list.size();
            System.out.println(p.list==clone.list);
            System.out.println(p.name==clone.name);
            System.out.println(p==clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
