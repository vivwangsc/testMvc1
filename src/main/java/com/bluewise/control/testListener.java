package com.bluewise.control;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by wangshunchu on 15/12/18.
 */
public class testListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("开始监听");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("监听器开始销毁");
    }
}
