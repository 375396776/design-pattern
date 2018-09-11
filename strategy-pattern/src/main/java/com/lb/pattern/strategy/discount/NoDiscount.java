package com.lb.pattern.strategy.discount;

/**
 * @author lb
 * @Title: NoDiscount
 * @Description: TODO
 * @date 2018/09/11  19:23
 */
public class NoDiscount implements Discount {
    @Override
    public Double getDiscout(Double amount) {
        return amount;
    }
}
