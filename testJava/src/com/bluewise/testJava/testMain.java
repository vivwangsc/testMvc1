package com.bluewise.testJava;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wangshunchu on 15/12/28.
 */
public class testMain implements Istudent, Isinger,Serializable {

    public static void sayGood() {
        System.out.println("我一定会执行成功");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayName() {
        System.out.println("My name is wang shun chu");
    }

    @Override
    public void sayClass() {
        System.out.println("我在铁道小学6年级一班");
    }

    @Override
    public void singer() {
        System.out.println("I can sing red river valley");
    }

    @testAna(name = "xiaohy")
    public static void main(String[] args)  throws Exception {
        testRef r1 = new testRef();
        testRef r2 = new testRef();
        int i ;
        i = r1.add(r1,r2);
        System.out.println(i);
        i = r1.add(r1,r2);
        System.out.println(i);
        i = r1.add(r1,r2);
        System.out.println(i);
        i = r1.add(r1,r2);
        System.out.println(i);

//        int tmpii = 10;
//        Thread td = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <10 ; i++) {
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
////                    tmpii++;
//                    System.out.println(Thread.currentThread().getName() + i);
//
//
//                }
//            }
//        });
//        td.start();
//        Thread td1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <10 ; i++) {
//                    try {
//                        Thread.sleep((int)(500*Math.random()));
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + i);
//
//
//                }
//            }
//        });
//        td1.start();
//
//        testMain test = new testMain();
//        test.sayHello();
//        test.sayName();
//        test.singer();
//        test.sayClass();
//        study<testMain> at = new study<testMain>();
//        at.setObj(test);
//        at.say();
//        //测试TestAna
//        for (Method m : test.getClass().getMethods()) {
//            for (Annotation a : m.getDeclaredAnnotations()) {
//                System.out.println(a.toString());
//                //a.annotationType().
//            }
//            System.out.println(m.getName());
//
//            try {
//                m.invoke(test);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
        //test.
    }

    @Override
    public String toString() {
        String s = "王顺初,小合影,还有其他东西";
        return s;
    }
}
