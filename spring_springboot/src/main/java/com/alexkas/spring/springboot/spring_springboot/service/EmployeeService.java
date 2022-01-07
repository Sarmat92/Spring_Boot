package com.alexkas.spring.springboot.spring_springboot.service;

import com.alexkas.spring.springboot.spring_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public void deleteEmployeeById(int id);
}
