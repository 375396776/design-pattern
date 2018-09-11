package com.lb.pattern.strategy;

import com.lb.pattern.strategy.discount.*;

/**
 * @author lb
 * @Title: Buyer
 * @Description: TODO
 * @date 2018/09/11  19:12
 */
public class Buyer {
    private Double amount;
    Discount discount = new NoDiscount();

    public void buy(Double amount) {
        this.amount = amount;
        if (amount >= 300) {
            System.out.println("满三百7折");
            discount = new ThreeDiscount();
        } else if (amount >= 200) {
            System.out.println("满二百8折");
            discount = new TwoDiscount();
        } else if (amount >= 100) {
            System.out.println("满一百9折");
            discount = new OneDiscount();
        }
    }
    public Double Price() {
        return discount.getDiscout(amount);
    }
}
