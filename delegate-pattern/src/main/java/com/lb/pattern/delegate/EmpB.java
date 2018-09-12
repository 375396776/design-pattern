package com.lb.pattern.delegate;

/**
 * @author lb
 * @Title: EmpB
 * @Description: TODO
 * @date 2018/09/12  15:55
 */
public class EmpB implements Skill {
    @Override
    public void doWell(String command) {
        System.out.println("我擅长销售，我来做！");
    }
}
