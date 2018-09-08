package com.lb.pattern.factory.func;

import com.lb.pattern.factory.Huawei;
import com.lb.pattern.factory.Mobile;

/**
 * @author lb
 * @Title: HuaweiFactory
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  19:22
 */
public class HuaweiFactory implements Factory {

    @Override
    public Mobile getMobile() {
        return new Huawei();
    }
}
