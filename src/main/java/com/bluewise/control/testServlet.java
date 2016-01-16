package com.bluewise.control;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wangshunchu on 15/12/18.
 */
public class testServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.print("来自servlet<br/>");
        String s= getServletConfig().getInitParameter("para1");
        out.print("参数一:"+ s + "<br/>");

    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("servlet开始初始化");
    }
}
