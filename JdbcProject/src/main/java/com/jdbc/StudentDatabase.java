package com.jdbc;

import com.jdbc.entity.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    public List<Student> getAllStudents() throws SQLException, ClassNotFoundException {
        // create a list to store students records
        List<Student> students = new ArrayList<>();
        // create the query to execute
        String sql = "select name, email, phone from student";
        // get connection object
        Connection connection = MyConnection.getConnection();
        // 3. inform driver about statement
        Statement statement = connection.createStatement();
        // execute the query
        ResultSet rs = statement.executeQuery(sql);
        // check if record exists
        while(rs.next()) {
            // create a new student object for every row in the database
            Student student = new Student();
            student.setName(rs.getString(1));
            student.setEmail(rs.getString(2));
            student.setPhone(rs.getString(3));
            System.out.println(student);
            // add row by row every student in the list
            students.add(student);
            System.out.println();
        }
        // return the list
        return  students;
    }

}
