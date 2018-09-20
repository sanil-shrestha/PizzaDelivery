package com.virinchi.pizza.listner;

import com.virinchi.pizza.common.DBConnect;
import com.virinchi.pizza.common.dto.ErrorDto;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(name = "DBListner")
public class DBListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc=sce.getServletContext();
        String driver=sc.getInitParameter("driver");
        String dburl=sc.getInitParameter("connectionString");
        String user=sc.getInitParameter("user");
        String password=sc.getInitParameter("password");

        ErrorDto errorDto=new ErrorDto();
        errorDto.setHasError(false);

        DBConnect connectDB=new DBConnect(driver,dburl,user,password,errorDto);
        Connection con=connectDB.getDBConnection();

        sc.setAttribute("con",con);
        sc.setAttribute("dbError",errorDto);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
