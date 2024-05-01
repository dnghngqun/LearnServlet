package com.hongquan.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/readSession")
public class readSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();

        String name = "";
        //tạo mới 1 session nếu server chưa có session
        //hoặc đọc lại session nếu đã request trước đó
        HttpSession session = req.getSession();

        Object obj = session.getAttribute("name");//method này trả về 1 object

        if (obj != null) {
            name = String.valueOf(obj);//convert obj -> String
        }else {
            resp.sendRedirect("http://localhost:8080/ServletPrj/createSession");
        }

        int age = (Integer) session.getAttribute("age");

        writer.println("Hello " + name + "<br>Age: " + age);

    }
}
