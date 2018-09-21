package com.virinchi.pizza.common;

import com.virinchi.pizza.common.dto.ErrorDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public static Connection con=null;
    private String driver;
    private String connectionString;
    private String uname;
    private String pwd;

    private ErrorDto errorDto;

    public DBConnect(String driver, String connectionString, String uname, String pwd, ErrorDto errorDto)
    {
        this.driver=driver;
        this.connectionString=connectionString;
        this.uname=uname;
        this.pwd=pwd;
        this.errorDto=errorDto;
    }

    public Connection getDBConnection(){
        if(con==null)
        {
            /*
                Load database driver
             */
            try {
                System.out.println(driver);
                Class.forName(driver);
                System.out.println("Driver Loaded Successfully!!");
            } catch (Exception e) {
                System.out.println("Driver could not be loaded!!");
                System.out.println(e);
                errorDto.setHasError(true);
                errorDto.setFileName("ConnectDB.java");
                errorDto.setErrorDesc("getdbConnection(); Driver Could not be loaded. <br>"+e.toString());
            }
            try {
                con=(Connection) DriverManager.getConnection(connectionString,uname,pwd);
                System.out.println("Connected to database successfully!!!");
            } catch (SQLException e) {
                System.out.println("Connection to database failed!");
                System.out.println(e);
                e.printStackTrace();
                errorDto.setHasError(true);
                errorDto.setFileName("ConnectDB.java");
                errorDto.setErrorDesc("getdbConnection(); Connection to Database Failed. <br>"+e.toString());
            }
        }
        return con;
    }


}
