package com.hongquan.servletprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "ServletConfig", urlPatterns = "/ServletConfig", initParams = {
        @WebInitParam(name = "name", value = "Hong Quan")//name ở đây chính là name ở getInitParameter
})
//có thể cấu hình ở xml bằng cách:
// trong mục servlet > servlet-name, servlet-class thì thêm 1 init-param
//bên trong init-param gồm param-name, param-value
public class ServletConfig extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = super.getServletConfig().getInitParameter("name");//là getInitParam ở trên


        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.println("Hello " + name);
    }
}
