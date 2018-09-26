package com.virinchi.pizza.servlet;

import com.virinchi.pizza.common.dto.ErrorDto;
import com.virinchi.pizza.dao.UserDao;
import com.virinchi.pizza.dto.UserDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    private UserDao userDao = null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        RequestDispatcher rd = null;

        ErrorDto errorDto = new ErrorDto();

        String responseMsg = null;
        String redirectPage = "login.jsp";

        String userName = request.getParameter("uname");
        String password = request.getParameter("password");

        UserDto user = new UserDto();
        user.setuName(userName);
        user.setPassword(password);

        Connection con = (Connection) getServletContext().getAttribute("con");

        userDao = new UserDao(user, con, errorDto);

        UserDto authenticateUser = null;

        try {
            authenticateUser = userDao.authenticate();
            if (authenticateUser != null) {
                System.out.println("I was here");
                redirectPage = "dashboard.jsp";
                HttpSession session = request.getSession();
                session.setAttribute("username", authenticateUser.getuName());
                session.setAttribute("username", authenticateUser.getUid());
            } else {
                responseMsg = "Login Failed";
            }
        } catch (SQLException e) {
            errorDto.setHasError(true);
            errorDto.setFileName("LoginServlet.java");
            errorDto.setErrorDesc(e.getMessage());
        }

        request.setAttribute("errorDto", errorDto);
        request.setAttribute("responseMsg", responseMsg);

        rd = request.getRequestDispatcher(redirectPage);
        rd.forward(request, response);

    }
}
