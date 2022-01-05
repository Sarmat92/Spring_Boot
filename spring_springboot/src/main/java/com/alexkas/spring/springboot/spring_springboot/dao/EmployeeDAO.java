package com.alexkas.spring.springboot.spring_springboot.dao;



import com.alexkas.spring.springboot.spring_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
