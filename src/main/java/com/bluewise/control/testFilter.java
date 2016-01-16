package com.bluewise.control;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wangshunchu on 15/12/18.
 */
public class testFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("开始进行过滤");
        String s = filterConfig.getInitParameter("para1");
        System.out.println("过滤器参数是:"+ s);

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("执行过滤");
        servletRequest.setAttribute("filter","王顺初");
        servletResponse.setCharacterEncoding("utf-8");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("销毁过滤器");

    }
}
