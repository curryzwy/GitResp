package com.zwy.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther:curryzwy
 * @Date:2021-02-05-16:59
 */
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getCharacterEncoding();
        servletResponse.getWriter().write("hello你好");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
