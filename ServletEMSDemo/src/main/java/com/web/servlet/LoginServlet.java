package com.web.servlet;

import com.web.database.EmployeeDatabase;
import com.web.database.LoginDatabase;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 1. Servlet is loaded only when it is requested for from the url /login
 * 2.Lifecycle of the servlet
 *      a. loading the java class
 *      b. compiling
 *      c. instantiating => new [ constructor is called ]
 *      d. init() -> is where you can load any data before the servlet starts processing the request
 *      starts providing the services.
 *      e. When the request is of type HTTP GET, then service() method invlokes the doGet() mwthod
 *      the service is ready to process the request
 *      f. destory() => clean up fo the resources
 * 3.There is only 1 instance of a servlet per application / tomcat
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        System.out.println("Login servlet constructor");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.sendRedirect("login.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pwd = req.getParameter("password");
        LoginDatabase loginDatabase = new LoginDatabase();
        if(loginDatabase.loginEmployee(email, pwd))
        {

        }
        PrintWriter out = resp.getWriter();
        out.println("<h1>Login Page POST"+ email +"</h1>");
    }


}
