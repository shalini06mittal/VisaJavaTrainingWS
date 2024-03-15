package com.web.service;

import com.web.database.EmployeeDatabase;
import com.web.dto.EmployeeDTO;
import com.web.entity.Employee;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// service -> between the request and database layer
public class EmployeeService {

    private EmployeeDatabase employeeDatabase ;

    public EmployeeService(EmployeeDatabase employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }
    // DTO -> data transfer object
    public List<EmployeeDTO> getEmployees() throws SQLException {
        List<EmployeeDTO> employees = new ArrayList<>();
        List<Employee> employeeList = this.employeeDatabase.getAllEmployees();
        for(Employee employee : employeeList)
        {
            EmployeeDTO dto = new EmployeeDTO();
            dto.setDepartment(employee.getDepartment());
            // all other fields
            employees.add(dto);
        }
        return  employees;
    }
}
