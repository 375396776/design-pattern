package com.lb.pattern.singleton;

import com.lb.pattern.singleton.hungry.HungrySingleton;
import com.lb.pattern.singleton.inner.InnerClassSingleton;
import com.lb.pattern.singleton.lazy.LazySingleton;
import com.lb.pattern.singleton.seriable.SeriableSingleton;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CountDownLatch;

/**
 * @author lb
 * @Title: SingletonTest
 * @Description: TODO
 * @date 2018/09/07  17:50
 */
public class SingletonTest {

    @Test
    public void testEfficiency() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 200000000; i++) {
//            Object obj = LazySingleton.getInstance();//实现测试才用synchronized锁和用双向检查锁 效率差不多4000+
            Object obj = LazySingleton.getInstance();//饿汉单例效率高 4/3/4
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (end - start));
    }

    @Test
    public void testThreadSafe() {
        int count = 200;

        //发令枪，我就能想到运动员
        CountDownLatch latch = new CountDownLatch(count);

        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {

                        try {
                            // 阻塞
                            // count = 0 就会释放所有的共享锁
                            // 万箭齐发
                            latch.await();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        //必然会调用，可能会有很多线程同时去访问getInstance()
                        Object obj = LazySingleton.getInstance();
                        System.out.println(System.currentTimeMillis() + ":" + obj);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start(); //每循环一次，就启动一个线程,具有一定的随机性

            //每次启动一个线程，count --
            latch.countDown();

        }

//        CountDownLatch 并不是这样子用,实际应用场景中不要学老师这样投机取巧
    }

    @Test
    public void testSeriable() {

        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("Seriable.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public  void testA(){
        for (int i=0;i<=10;i++){
            Object obj = LazySingleton.getInstance();
            System.out.println(System.currentTimeMillis() + ":" + obj);
        }
    }

}
