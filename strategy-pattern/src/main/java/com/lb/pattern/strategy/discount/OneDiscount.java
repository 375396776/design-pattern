package com.lb.pattern.strategy.discount;

/**
 * @author lb
 * @Title: OneDiscount
 * @Description: TODO
 * @date 2018/09/11  19:04
 */
public class OneDiscount implements Discount {
    @Override
    public Double getDiscout(Double amount) {
        return amount*0.9;
    }
}
