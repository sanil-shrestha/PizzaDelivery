package com.virinchi.pizza.dao;

import com.virinchi.pizza.dto.UserDto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    private PreparedStatement pstmt;
//    private Connection con=DBConnect().con;

    public int selectUser(UserDto user) throws SQLException {
        UserDto userInDb=null;

        String query = "SELECT * FROM tblData WHERE userName=?";
//        pstmt=con.prepareStatement(query);
//        pstmt.setString(1,user.getUserName());
//        System.out.println(user.getUserName());
//        ResultSet rs=pstmt.executeQuery();
        return 0;
    }


}
