package com.lb.pattern.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author lb
 * @Title: Prototype
 * @Description: TODO
 * @date 2018/09/09  01:28
 */
public class Prototype implements Cloneable,Serializable {
    String name = "lb";

    //创建泛型List类实例
    List<String> list = new ArrayList<String>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return deepClone();
    }
    public Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Prototype copy = (Prototype)ois.readObject();
//            copy.list = new ArrayList<>();
            return copy;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
