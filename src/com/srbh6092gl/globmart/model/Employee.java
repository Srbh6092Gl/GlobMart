package com.srbh6092gl.globmart.model;

public class Employee {
    int eid;
    String ename;
    String work_location;
    int yearsOfExperiance;

    public Employee(int eid, String ename, String work_location, int yearsOfExperiance) {
        this.eid = eid;
        this.ename = ename;
        this.work_location = work_location;
        this.yearsOfExperiance = yearsOfExperiance;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getWork_location() {
        return work_location;
    }

    public void setWork_location(String work_location) {
        this.work_location = work_location;
    }

    public int getYearsOfExperiance() {
        return yearsOfExperiance;
    }

    public void setYearsOfExperiance(int yearsOfExperiance) {
        this.yearsOfExperiance = yearsOfExperiance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", work_location='" + work_location + '\'' +
                ", yearsOfExperiance=" + yearsOfExperiance +
                '}';
    }
}
