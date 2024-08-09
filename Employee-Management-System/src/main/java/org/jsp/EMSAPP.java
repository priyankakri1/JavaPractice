package org.jsp;

import java.util.Scanner;

public class EMSAPP {
    public static void main(String[] args) {
        System.out.println("=========================================");
        // Creating instances of EmployeeCreation and Scanner
        EmployeeCreation ec = new EmployeeCreation();
        Scanner sc = new Scanner(System.in);

        // Creating an EmployeeDB instance to manage employees
        EmployeeDB eDB = new EmployeeDB(10);

        // Displaying menu options in a loop to handle multiple user inputs
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Save Employee Details");
            System.out.println("2. Print All Employee Details");
            System.out.println("3. Count All Employee Details");
            System.out.println("4. Search Employee Details");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Delete Employee Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            // Reading user choice
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline character after reading integer

            switch (choice) {
                case 1:
                    // =======================Save Employee Details===========================
                    System.out.println("Enter details for Employee:");
                    System.out.print("Name:  ");
                    String name = sc.nextLine();
                    System.out.print("Salary:  ");
                    double salary = sc.nextDouble();
                    System.out.print("Experience:  ");
                    double experience = sc.nextDouble();
                    sc.nextLine();  // Consume newline left-over
                    System.out.print("Designation:  ");
                    String designation = sc.nextLine();
                    System.out.print("Company:  ");
                    String company = sc.nextLine();

                    // Creating the employee using EmployeeCreation instance
                    Employee e = ec.createEmployee(name, salary, experience, designation, company);

                    // Adding employee to the database
                    if (eDB.addEmployee(e)) {
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Failed to add employee. Database may be full.");
                    }
                    break;

                case 2:
                    // ==================================Print All Employee Details====================
                    eDB.viewFullDatabase();
                    break;

                case 3:
                    // Count All Employee Details
                    int count = eDB.getEmployeeCount();
                    System.out.println("Total employees: " + count);
                    break;

                case 4:
                    // Search Employee Details by ID
                    System.out.print("Enter employee ID to search: ");
                    int id = sc.nextInt();
                    sc.nextLine();  // Consume newline left-over
                    Employee foundEmployee = eDB.searchEmployee(id);
                    if (foundEmployee != null) {
                        System.out.println("Found Employee: " + foundEmployee.getId() + " " + foundEmployee.getName()+" "+foundEmployee.getSalary()+" "+foundEmployee.getExperience()+" "+foundEmployee.getDesignation()+" "+foundEmployee.getCompany());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    // Update Employee Salary by ID
                    System.out.print("Enter employee ID to update salary: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter amount to increase salary: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();  // Consume newline left-over
                    if (eDB.updateSalary(updateId, amount)) {
                        System.out.println("Salary updated successfully.");
                        eDB.viewFullDatabase();
                    } else {
                        System.out.println("Failed to update salary. Employee not found.");
                    }
                    break;

                case 6:
                    // Delete Employee Details by ID
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();  // Consume newline left-over
                    if (eDB.deleteEmployee(deleteId)) {
                        System.out.println("Employee deleted successfully.");
                    } else {
                        System.out.println("Failed to delete employee. Employee not found.");
                    }
                    break;

                case 7:
                    // Exit the program
                    System.out.println("Exiting...");
                    System.exit(0);  // Exiting the program
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;
            }
        }
    }
}
