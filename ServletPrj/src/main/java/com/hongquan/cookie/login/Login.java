package com.hongquan.cookie.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<form action='/ServletPrj/login' method='post'>" +
                "Username: <input type='text' name='username'><br>" +
                "Password: <input type='password' name='password'><br>" +
                "<input type='submit' value='login'>" +
                "</form>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals("Admin") && password.equals("admin")){
            Cookie cookie = new Cookie(username, password);
            cookie.setMaxAge(60);
            resp.addCookie(cookie);
            resp.sendRedirect("http://localhost:8080/ServletPrj/welcome");
        }else {
            resp.sendRedirect("http://localhost:8080/ServletPrj/login");
        }

    }
}
