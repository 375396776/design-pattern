package com.lb.pattern.delegate;

/**
 * @author lb
 * @Title: EmpC
 * @Description: TODO
 * @date 2018/09/12  15:56
 */
public class EmpC implements Skill {
    @Override
    public void doWell(String command) {
        System.out.println("我擅长做饭，我来做！");
    }
}
