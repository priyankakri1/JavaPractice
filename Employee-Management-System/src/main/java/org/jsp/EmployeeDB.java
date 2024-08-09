package org.jsp;

public class EmployeeDB {
    private Employee[] emparr;
    private int index = 0;
    private int empCount = 0;

    // Constructor to initialize the array of employees with specified size
    public EmployeeDB(int size) {
        emparr = new Employee[size];
    }

    // Method to add an employee to the database
    public boolean addEmployee(Employee e) {
        if (index < emparr.length) {
            emparr[index++] = e;
            System.out.println("Employee details added to the database");
            empCount++;
            return true;
        }
        else {
            System.out.println("Database is full");
            return false;
        }
    }

    // Method to view the full database of employees
    public void viewFullDatabase() {
        System.out.println("===================================");
        System.out.println("ID\tNAME\tSALARY\tEXPERIENCE\tDESIGNATION\tCOMPANY");
        for (Employee emp : emparr) {
            if (emp != null) {
                System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary() + "\t" +
                        emp.getExperience() + "\t" + emp.getDesignation() + "\t" + emp.getCompany());
            }
        }
    }

    // Method to get the total count of employees in the database
    public int getEmployeeCount() {
        return empCount;
    }

    // Method to search for an employee by ID
    public Employee searchEmployee(int id) {
        Employee e = null;
        for (int i=0; i<emparr.length;i++) {
            if (emparr[i] != null && emparr[i].getId() == id) {
                System.out.println("Employee found in database");
                e = emparr[i];
            }
        }
        if (e == null) {
            System.out.println("Employee is not found in database");
        }
        return e;
    }

    // Method to update the salary of an employee by ID
    public boolean updateSalary(int id, double amount) {
        Employee e = searchEmployee(id);
        if (e != null) {
            e.setSalary(e.getSalary() + amount);
            System.out.println("Salary updated successfully");
            return true;
        } else {
            System.out.println("Unable to update salary, employee not found");
            return false;
        }
    }

    // Method to delete an employee from the database by ID
    public boolean deleteEmployee(int id) {
        boolean isDeleted = false;
        for (int i = 0; i < emparr.length; i++) {
            if (emparr[i] != null && emparr[i].getId() == id) {
                System.out.println("Employee found in database and deleted");
                emparr[i] = null;
                isDeleted = true;
                empCount--;
            }
        }
        if (!isDeleted) {
            System.out.println("Employee is not found in database");
        }
        return isDeleted;
    }
}
