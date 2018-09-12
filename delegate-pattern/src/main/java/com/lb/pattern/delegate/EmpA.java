package com.lb.pattern.delegate;

/**
 * @author lb
 * @Title: EmpA
 * @Description: TODO
 * @date 2018/09/12  15:54
 */
public class EmpA implements Skill {
    @Override
    public void doWell(String command) {
        System.out.println("我擅长开发，我来做！");
    }
}
