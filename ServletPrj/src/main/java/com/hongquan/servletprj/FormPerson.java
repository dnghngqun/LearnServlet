package com.hongquan.servletprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formPerson")
public class FormPerson extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter writer = resp.getWriter();
        writer.println("<form action='/ServletPrj/addPerson' method='get'>");
        writer.println("Name: <input type='text' name='name'><br>");
        writer.println("Age: <input type='number' name='age'><br>");
        writer.println("Address: <input type='text' name='address'><br>");
        writer.println("<input type='submit' value='Submit'>");
        writer.println("</form>");
    }
}
