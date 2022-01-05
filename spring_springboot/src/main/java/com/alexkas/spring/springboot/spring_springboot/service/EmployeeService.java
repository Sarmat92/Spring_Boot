package com.alexkas.spring.springboot.spring_springboot.service;

import com.alexkas.spring.springboot.spring_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
