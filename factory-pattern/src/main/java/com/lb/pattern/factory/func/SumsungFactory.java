package com.lb.pattern.factory.func;

import com.lb.pattern.factory.Mobile;
import com.lb.pattern.factory.Summung;

/**
 * @author lb
 * @Title: SumsungFactory
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  19:23
 */
public class SumsungFactory implements Factory {
    @Override
    public Mobile getMobile() {
        return new Summung();
    }
}
