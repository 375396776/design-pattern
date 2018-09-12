package com.lb.pattern.delegate;

/**
 * @author lb
 * @Title: Boss
 * @Description: TODO
 * @date 2018/09/12  15:47
 */
public class Boss {
    public static void main(String[] args) {
        new Leader().dispatch("做饭");

    }
}
