package com.jdbc;

import com.jdbc.entity.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {
        System.out.println( "Hello World!" );
        //MyConnection.getConnection();
        StudentDatabase database = new StudentDatabase();
        List<Student> list = database.getAllStudents();
        System.out.println(list.size());
        for (Student student:list)
        System.out.println(student);
    }
}
