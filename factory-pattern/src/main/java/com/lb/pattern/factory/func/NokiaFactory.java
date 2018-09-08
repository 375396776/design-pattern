package com.lb.pattern.factory.func;

import com.lb.pattern.factory.Mobile;
import com.lb.pattern.factory.Nokia;

/**
 * @author lb
 * @Title: NokiaFactory
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  19:21
 */
public class NokiaFactory implements Factory {
    @Override
    public Mobile getMobile() {
        return new Nokia();
    }
}
