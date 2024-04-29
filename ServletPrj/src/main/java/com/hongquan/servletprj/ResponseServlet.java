package com.hongquan.servletprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/response")
public class ResponseServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");//set nội dung trả về định dạng 1 trang web
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello Hong Quan!</h1>");

        response.addCookie(new Cookie("a", "a"));
        response.addHeader("a", "aaa");//key-value

        response.sendError(200);//trả về nội dung thành công hay ko
    }
}
