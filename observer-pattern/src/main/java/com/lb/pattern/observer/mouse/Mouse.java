package com.lb.pattern.observer.mouse;

import com.lb.pattern.observer.core.EventLisenter;

/**
 * @author lb
 * @Title: com.lb.pattern.observer.mouse.Mouse
 * @Description: TODO
 * @date 2018/09/13  16:33
 */
public class Mouse extends EventLisenter {

    public void click(){
        System.out.println("鼠标单击");
        this.trigger(MouseEventType.ON_CLICK);
    }


    public void doubleClick(){
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }
}
