package com.hongquan.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addCookie")
public class addCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Hello Master</h1>");
        Cookie cookie1 = new Cookie("name", "HongQuan");
        cookie1.setMaxAge(60);//set thời gian sống của cookie, tính theo giây

        resp.addCookie(cookie1);

        Cookie cookie2 = new Cookie("age", "20");
        cookie2.setMaxAge(60);//set thời gian sống của cookie, tính theo giây

        resp.addCookie(cookie2);

    }
}
