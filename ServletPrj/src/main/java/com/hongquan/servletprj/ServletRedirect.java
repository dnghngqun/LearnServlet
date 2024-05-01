package com.hongquan.servletprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/redirect")
public class ServletRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //C1
//        resp.sendRedirect("https://www.google.com");

        //C2
        resp.setStatus(resp.SC_MOVED_TEMPORARILY);//chuyển hướng trang mãi mãi
        resp.setHeader("Location", "https://www.google.com");
    }
}
