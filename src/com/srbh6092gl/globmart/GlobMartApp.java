package com.srbh6092gl.globmart;

import com.srbh6092gl.globmart.model.Employee;
import com.srbh6092gl.globmart.model.Project;
import com.srbh6092gl.globmart.service.EmployeeService;
import com.srbh6092gl.globmart.serviceImplentation.EmployeeServiceImpl;

import java.util.List;
import java.util.Map;

public class GlobMartApp {
    static EmployeeService employeeService;
    public static void main(String[] args) {

        employeeService = new EmployeeServiceImpl();
        System.out.println("Requirement 1");
        addEmployee();
        displayEmployee();

        System.out.println("Requirement 2");
        sortByCountry().stream().forEach(System.out::println);

        System.out.println("Requirement 3");
        sortById().stream().forEach(System.out::println);

        System.out.println("Requirement 4");
        createList();

//        Project project = new Project("p101", "Anaplan")

        //// working on requirement 5

    }

    private static void addEmployee(){
        
        Employee employee1 = new Employee(101,"Roger","UK", 1);
        Employee employee2 = new Employee(102,"Sam","Inida", 2);
        Employee employee3 = new Employee(103,"Xiang","China", 7);
        Employee employee4 = new Employee(104,"Willey","US", 4);
        Employee employee5 = new Employee(105,"Jabe","Inida", 20);

        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);
        employeeService.addEmployee(employee4);
        employeeService.addEmployee(employee5);

    }
    private static void displayEmployee() {
        employeeService.getEmployees().stream().forEach(System.out::println);
    }

    private static  List<Employee> sortByCountry(){
        return employeeService.sortByCountry();
    }
    private static  List<Employee> sortById (){
        return employeeService.sortById();
    }
    private  static void createList(){
        Map<String,List<Employee>> map = employeeService.createList();
        System.out.println("Odd employee id:");
        map.get("odd").stream().forEach(System.out::println);

        System.out.println("Even employee id:");
        map.get("even").stream().forEach(System.out::println);
    }
}
