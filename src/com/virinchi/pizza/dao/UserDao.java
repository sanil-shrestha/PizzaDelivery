package com.virinchi.pizza.dao;

import com.virinchi.pizza.common.DBConnect;
import com.virinchi.pizza.dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private PreparedStatement pstmt;
    private Connection con = DBConnect.con;

    public UserDto selectUser(UserDto user) throws SQLException {
        UserDto userInDb = null;

        String query = "SELECT * FROM tblData WHERE uName=?";
        pstmt = con.prepareStatement(query);
        pstmt.setString(1, user.getuName());
        System.out.println(user.getuName());
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            userInDb = new UserDto();
            userInDb.setPhoneNum(rs.getString("phoneNum"));
            System.out.println("User Address :" + userInDb.getPhoneNum());
            userInDb.setFirstName(rs.getString("firstName"));
            System.out.println("User First Name " + userInDb.getFirstName());
            userInDb.setLastName(rs.getString("lastName"));
            System.out.println("User Last name" + userInDb.getLastName());
        }

        return userInDb;
    }

    public UserDto authenticate(UserDto user) throws SQLException {
        UserDto userInDb = null;

        String query = "SELECT * FROM tblData WHERE userName=? and password=?";

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, user.getuName());
        pstmt.setString(2, user.getPassword());

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            userInDb = new UserDto();
            userInDb.setPhoneNum(rs.getString("phoneNum"));
            System.out.println("User Address :" + userInDb.getPhoneNum());
            userInDb.setFirstName(rs.getString("firstName"));
            System.out.println("User First Name " + userInDb.getFirstName());
            userInDb.setLastName(rs.getString("lastName"));
            System.out.println("User Last name" + userInDb.getLastName());
        }

        return userInDb;

    }


}
