package com.srbh6092gl.globmart.serviceImplentation;

import com.srbh6092gl.globmart.model.Employee;
import com.srbh6092gl.globmart.service.EmployeeService;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String addEmployee(Employee employee) {
        employees.add(employee);
        return "Added " + employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public List<Employee> sortByCountry() {
        return getEmployees().stream().sorted(Comparator.comparing(Employee::getEname)).collect(Collectors.toList());
    }

    @Override
    public List<Employee> sortById() {
        return getEmployees().stream().sorted(Comparator.comparingInt(Employee::getEid)).collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Employee>> createList() {
        List<Employee> odd = new ArrayList<>();
        List<Employee> even = new ArrayList<>();
        getEmployees().stream().forEach(e-> {
            if (e.getEid()%2==0)
                even.add(e);
            else
                odd.add(e);
        });
        Map<String, List<Employee>> map = new HashMap<>();
        map.put("odd",odd);
        map.put("even",even);
        return map;
    }
}
