package com.bluewise.testJava;

/**
 * Created by wangshunchu on 15/12/29.
 */
public class testRef {
    public int i=0;
    public int add(testRef r1,testRef r2)
    {
        r1.i = r1.i + 1;
        r2.i = r2.i + 1;
        return r1.i + r2.i;
    }
}
