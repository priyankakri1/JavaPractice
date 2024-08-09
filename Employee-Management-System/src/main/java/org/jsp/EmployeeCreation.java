package org.jsp;

public class EmployeeCreation {
    private static int random = 1001;

    public Employee createEmployee(String name, double salary, double experience, String designation, String company) {
        Employee e = new Employee(random++, name, salary, experience, designation, company);
        return e;
    }
}
