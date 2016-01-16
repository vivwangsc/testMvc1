package com.bluewise.testJava;

/**
 * Created by wangshunchu on 15/12/28.
 */
public class study<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void say()
    {

        String s = obj.toString();
        System.out.println(s);
    }
}
