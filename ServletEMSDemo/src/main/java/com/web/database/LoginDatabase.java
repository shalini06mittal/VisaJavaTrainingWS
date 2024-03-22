package com.web.database;

import com.web.exception.InvalidCredentialsException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDatabase {

    /**
     * this method should return true for valid email and password.
     * If invalid email then it should throw InvalidCredentialsException with a message "Email does not exist"
     * If invalid password then it should throw InvalidCredentialsException with a message "Invalid password"
     */
    public boolean loginEmployee(String email, String password) throws SQLException, ClassNotFoundException, InvalidCredentialsException {
        String sql = "Select password from employee where email = ?";
        Connection connection = MyConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        ResultSet rs = statement.executeQuery();
        if(rs.next()){
            if(rs.getString(1).equals(password))
                return true;
            else
                throw new InvalidCredentialsException("Invalid password");
        }
        else{
            throw new InvalidCredentialsException("Invalid Email");
        }

    }
}
