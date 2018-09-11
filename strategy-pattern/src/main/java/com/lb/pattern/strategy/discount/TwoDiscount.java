package com.lb.pattern.strategy.discount;

/**
 * @author lb
 * @Title: TwoDiscount
 * @Description: TODO
 * @date 2018/09/11  19:09
 */
public class TwoDiscount implements Discount {
    @Override
    public Double getDiscout(Double amount) {
        return amount*0.8;
    }
}
