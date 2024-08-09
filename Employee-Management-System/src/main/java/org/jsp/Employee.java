package org.jsp;

public class Employee {
private final int id;
private String name;
private double salary;
private double experience;
private String designation;
private String company;

//================================Constructor============================

    public Employee(int id, String name, double salary, double experience, String designation, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.designation = designation;
        this.company = company;
    }
//    ===========================================Getters and Setters===========================


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
