package com.srbh6092gl.globmart.service;

import com.srbh6092gl.globmart.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    String addEmployee(Employee employee);
    List<Employee> getEmployees();

    List<Employee> sortByCountry();

    List<Employee> sortById();

    Map<String, List<Employee>> createList();
}
