package com.example.myfirstservlet;

import java.io.*;
import java.util.regex.Pattern;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String username=request.getParameter("user");
        String password=request.getParameter("pwd");
        String user="Sahil";

        String pass="Sk7775035369@";
        String passPattern="^(?=.*[0-9])(?=.*[A-Z])(?=.*[~!@#$%^&*()<>:{},.;'])([A-Za-z0-9~!@#$%^&*()<>:{},.;']){8,}$";
        //if(username.equals(user) && password.equals(pass) ){
        if((Pattern.matches("^[A-Z][a-z]{2,}$", username))&&(Pattern.matches(passPattern, password))) {
            request.setAttribute("user", user);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
        //}
        else{
            RequestDispatcher rd= getServletContext().getRequestDispatcher("/index.html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1 style='color:red'>Either Name or password is wrong</h1>");
            rd.include(request,response);
        }

    }

    public void destroy() {
    }
}