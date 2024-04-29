package com.hongquan.servletprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addPerson")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address  = req.getParameter("address");

        writer.println("Hello " + name);
        writer.println("Age: " + age);
        writer.println("Address: " + address);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address  = req.getParameter("address");
        writer.println("Method GET");
        writer.println("Hello " + name);
        writer.println("Age: " + age);
        writer.println("Address: " + address);

    }
}
