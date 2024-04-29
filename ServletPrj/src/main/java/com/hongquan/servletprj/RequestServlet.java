package com.hongquan.servletprj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

@WebServlet(name = "RequestServlet", urlPatterns = "/request")
public class RequestServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Method: " + request.getMethod());
        request.getContentType();
        request.getCookies();
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Server name: " + request.getServerName());
        System.out.println("Sevlet path: " + request.getServletPath());

        Enumeration<String> keys = request.getHeaderNames();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key:" + request.getHeader(key));
        }
    }
}
