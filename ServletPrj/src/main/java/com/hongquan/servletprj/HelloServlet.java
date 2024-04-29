package com.hongquan.servletprj;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
//annotation tạo đường dẫn mà không cần cấu hình trong xml
@WebServlet(name = "helloServlet", urlPatterns = {"/hello-servlet", "/xin-chao"})
public class HelloServlet {
    private String message;

    public void init() {
        System.out.println("Bắt đầu servlet");
        message = "Hello World! This is page from servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");//set nội dung trả về định dạng 1 trang web

        // Hello
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        writer.println("<h1>" + message + "</h1>");
        writer.println("</body></html>");
    }


    public void destroy() {
        System.out.println("Kết thúc servlet");
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        super.service(request, response);

        System.out.println("Method: " + request.getMethod());
    }
}