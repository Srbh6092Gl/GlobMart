package com.srbh6092gl.globmart.model;

import java.util.List;

public class Project  {
    String pcode;
    String project_name;
    List<Employee> employees;

    public Project(String pcode, String project_name, List<Employee> employees) {
        this.pcode = pcode;
        this.project_name = project_name;
        this.employees = employees;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pcode='" + pcode + '\'' +
                ", project_name='" + project_name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
