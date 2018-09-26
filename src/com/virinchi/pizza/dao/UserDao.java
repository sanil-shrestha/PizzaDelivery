package com.virinchi.pizza.dao;

import com.virinchi.pizza.common.DBConnect;
import com.virinchi.pizza.common.dto.ErrorDto;
import com.virinchi.pizza.dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private PreparedStatement pstmt;
    private Connection con;
    private UserDto user;
    private ErrorDto errorDto;

    public UserDao(){

    }

    public UserDao(UserDto user, Connection con, ErrorDto errorDto) {
        this.con = con;
        this.errorDto = errorDto;
        this.user = user;
    }

    public UserDto authenticate() throws SQLException {

        String query = "SELECT * FROM tbl_login WHERE uName=? and password=?";

        pstmt = con.prepareStatement(query);

        pstmt.setString(1, user.getuName());
        pstmt.setString(2, user.getPassword());

        ResultSet rs=pstmt.executeQuery();

        UserDto userInDb=null;

        while (rs.next()){
            userInDb=new UserDto();
            userInDb.setPhoneNum(rs.getString("phoneNum"));
            userInDb.setFirstName(rs.getString("firstName"));
            userInDb.setLastName(rs.getString("lastName"));
            userInDb.setuName(rs.getString("lastName"));
            userInDb.setuName(rs.getString("uid"));
        }

        return userInDb;

    }



}
