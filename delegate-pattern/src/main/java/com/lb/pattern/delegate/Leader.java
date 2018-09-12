package com.lb.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lb
 * @Title: Leader
 * @Description: TODO
 * @date 2018/09/12  15:48
 */
public class Leader implements Skill{

    Map<String,Skill> m = new HashMap<String, Skill>();

    public Leader(){
        m.put("开发",new EmpA() );
        m.put("销售",new EmpB() );
        m.put("做饭",new EmpC() );
    }

    @Override
    public void doWell(String command) {
        System.out.println("我擅长调配，我来做！");
    }
    public void dispatch(String command){
        m.get(command).doWell(command);
    }




}
