package com.web.database;

import com.web.entity.Employee;
import com.web.exception.EntityExistsException;
import com.web.exception.EntityNotFoundException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// repository, DAO [ Data Access Object ] layer
public class EmployeeDatabase {

    private static Connection connection;

    static {
        try {
            connection = MyConnection.getConnection();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Check if employee with id exists then throw EntityExistsException with a message "Cannot insert as employee with id already exist"
     * If employee with id does not exist then insert and return the employee object with id that was auto generated
     * @param employee
     * @return
     */
    public Employee insertEmployee(Employee employee) throws SQLException, EntityExistsException {
        if(existsById(employee.getEid()))
            throw new EntityExistsException("Cannot insert as employee with id "+employee.getEid()+" already exist")  ;

        String sql = "insert into employee(ename, email, phone,department, password) values(?,?,?,?,?)";
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setString(1, employee.getEname());
        statement.setString(2, employee.getEmail());
        statement.setString(3, employee.getPhone());
        statement.setString(4, employee.getDepartment());
        statement.setString(5, employee.getPassword());
        statement.executeUpdate();
        int id = getLastInsertedId();
        if(id!=-1)
            employee.setEid(id);
        return employee;
    }

    private int getLastInsertedId() throws SQLException {
        String sql = "select eid from employee order by eid desc limit 1";
        PreparedStatement statement =connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        if(rs.next())
            return rs.getInt(1);
        return -1;
    }
    public boolean existsById(int eid) throws SQLException {
        String sql = "select count(*) from employee where eid=?";
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setInt(1, eid);
        ResultSet rs = statement.executeQuery();
        if(rs.next())
            return true;
        return false;
    }

    /**
     * Check if employee with id exists then update it and return the saved and updated employee
     * If employee with id does not exist then throw EntityNotFoundException with a message "Cannot update as employee with id does not exist"
     * @param employee
     * @return
     */
    public Employee updateEmployee(Employee employee) throws EntityNotFoundException, SQLException {
        if(!existsById(employee.getEid()))
            throw new EntityNotFoundException("Cannot update as employee with id "+employee.getEid()+" does not exist")  ;

        String sql = "update employee set ename=?, email=?, phone=?,department=? where eid=?";
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setString(1, employee.getEname());
        statement.setString(2, employee.getEmail());
        statement.setString(3, employee.getPhone());
        statement.setString(4, employee.getDepartment());
        statement.setInt(5, employee.getEid());
        statement.executeUpdate();
        return employee;
    }

    /**
     * Check if employee with id exists then delete it and return true
     * If employee with id does not exist then throw EntityNotFoundException with a message "Cannot delete as employee with id does not exist"
     * @param eid
     * @return
     */
    public boolean deleteEmployeeById(int eid) throws SQLException, EntityNotFoundException {
        if(! existsById(eid))
            throw new EntityNotFoundException("Cannot delete as employee with id "+eid+" does not exist") ;

        String sql = "delete from employee where eid=?";
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setInt(1, eid);
        statement.executeUpdate();
        return true;
    }

    /**
     * Return list of all employees else return an empty list
     * @return
     */
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        // select <columns> from employee
        String sql = "select * from employee";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        while (rs.next())
        {
            Employee employee = new Employee();
            employee.setEid(rs.getInt(1));
            employee.setEname(rs.getString(2));
            employee.setEmail(rs.getString(3));
            employee.setPhone(rs.getString(4));
            employee.setDepartment(rs.getString(5));
            employee.setPassword(rs.getString(6));
            employees.add(employee);
        }
        return employees;
    }

    /**
     * Return list of all employees for that department else return an empty list
     * @return
     */
    public List<Employee> getAllEmployeesByDepartment(String department) throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "select eid, ename, email, phone, department from employee where department=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, department);
        ResultSet rs = statement.executeQuery();
        while (rs.next())
        {
            Employee employee = new Employee();
            employee.setEid(rs.getInt(1));
            employee.setEname(rs.getString(2));
            employee.setEmail(rs.getString(3));
            employee.setPhone(rs.getString(4));
            employee.setDepartment(rs.getString(5));
            employees.add(employee);
        }
        return employees;
    }

    /**
     * If id exists then return all fields except the password
     * if id does not exist then it should throw EntityNotFoundException with message "Employee with id does not exist"
     * @param eid
     * @return
     */
    public Employee getEmployeeById(int eid) throws SQLException, EntityNotFoundException {
        String sql = "select ei, ename, email, phone, department from employee where eid=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, eid);
        ResultSet rs = statement.executeQuery();
        if(rs.next())
        {
            Employee employee = new Employee();
            employee.setEid(rs.getInt(1));
            employee.setEname(rs.getString(2));
            employee.setEmail(rs.getString(3));
            employee.setPhone(rs.getString(4));
            employee.setDepartment(rs.getString(5));
            return  employee;
        }
       throw new EntityNotFoundException("Employee with "+eid+" does not exist");
    }


}
