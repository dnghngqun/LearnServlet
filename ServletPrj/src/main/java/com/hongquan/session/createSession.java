package com.hongquan.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/createSession")
public class createSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //tạo mới 1 session nếu server chưa có session
        //hoặc đọc lại session nếu đã request trước đó
        HttpSession session = req.getSession();

        session.setAttribute("name", "Hong Quan");
        session.setAttribute("age", new Integer(20));
        session.setMaxInactiveInterval(60);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();

        writer.println("Hello HongQuan - Set session");
    }
}
