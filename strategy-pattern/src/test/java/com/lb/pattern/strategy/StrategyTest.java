package com.lb.pattern.strategy;

import org.junit.Test;

/**
 * @author lb
 * @Title: StrategyTest
 * @Description: TODO
 * @date 2018/09/11  19:31
 */
public class StrategyTest {
    @Test
    public void testDiscount(){
        Buyer buyer = new Buyer();
        buyer.buy(299D);
        System.out.println(buyer.Price());
    }
}
