package com.lb.pattern.observer.mouse;

import com.lb.pattern.observer.core.Event;

/**
 * @author lb
 * @Title: MouseEventCallback
 * @Description: TODO
 * @date 2018/09/13  16:35
 */
public class MouseEventCallback {

    public void onClick(Event e){
        System.out.println("这是鼠标单击以后要执行的逻辑");
        System.out.println("=======触发鼠标单击事件========\n" + e);
    }

    public void onDoubleClick(Event e){
        System.out.println("=======触发鼠标双击事件========\n" + e);
    }

}
