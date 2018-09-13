package com.lb.pattern.observer.mouse;

import com.lb.pattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * @author lb
 * @Title: test
 * @Description: TODO
 * @date 2018/09/13  17:08
 */
public class test {

    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);


            //人为的调用鼠标的单击事件
            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK, callback,onClick);

            mouse.click();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
