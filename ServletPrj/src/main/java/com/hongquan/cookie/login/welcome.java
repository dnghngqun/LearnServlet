package com.hongquan.cookie.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/welcome")
public class welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String name = "";
        PrintWriter writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();

        for(Cookie c: cookies) {
            if (c.getName().equals("Admin")) {
                name = c.getValue();
            }
        }
        if (name.equals("")) {
            resp.sendRedirect("http://localhost:8080/ServletPrj/login");
        }

        writer.println("<h1>Welcome " + name + "</h1>");
        writer.close();
    }
}
