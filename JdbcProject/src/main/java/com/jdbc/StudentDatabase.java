package com.jdbc;

import com.jdbc.entity.Student;

import java.sql.*;
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

    public Student getStudentById(int id) throws SQLException, ClassNotFoundException {
        String sql = "select * from student where id="+id;
        // get connection object
        Connection connection = MyConnection.getConnection();
        // 3. inform driver about statement
        Statement statement = connection.createStatement();
        // execute the query
        ResultSet rs = statement.executeQuery(sql);
        // check if record exists
        Student student = null;
        if(rs.next()) {
            // create a new student object for every row in the database
            student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setEmail(rs.getString(3));
            student.setPhone(rs.getString(4));
        }
        // return the list
        return  student;
    }

    public  boolean insertStudent(Student student)  {
        String sql = "insert into student values("+student.getId()+",'"
                +student.getName()+"','"
                +student.getEmail()+"','"
                +student.getPhone()+"')";
        Connection connection = null;
        int rs = -1;
        try {
            connection = MyConnection.getConnection();
            Statement statement = connection.createStatement();
            // execute the query
            rs = statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            System.out.println(rs);
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("sql "+rs);
            throw new RuntimeException(e);
        }
        // 3. inform driver about statement
        return  true;
    }
    public  boolean insertStudentWithPreparedStatement(Student student)  {
        String sql = "insert into student values(?,?,?,?)";
        Connection connection = null;

        try {
            connection = MyConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, student.getId());
            statement.setString(2, student.getName());
            statement.setString(3, student.getEmail());
            statement.setString(4, student.getPhone());
            statement.executeUpdate();
        } catch (ClassNotFoundException e) {

            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return  false;
        }

        return  true;
    }
}
