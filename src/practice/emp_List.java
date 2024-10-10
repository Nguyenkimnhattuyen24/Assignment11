package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class emp_List {

    private ArrayList<Employee> employeeList;
    Scanner scanner = new Scanner(System.in);

    public emp_List(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public emp_List() {
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);

    }

    public void updateEmployee(String id) {
        for (Employee emp : employeeList) {
            if (emp.getEmpID().equals(emp)) {
                emp.input();
            }
        }
        System.out.println("Not found");
    }

    public void deleteEmployee(String empid) {
        employeeList.removeIf(Employee -> Employee.getEmpID().equals(empid));

    }

    public Employee Find(String empid) {
        for (Employee emp : employeeList) {
            if (emp.getEmpID().equals(empid)) {
                return emp;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Employee emp : employeeList) {
            emp.output();
        }
    }

    public void Menu() {
        while (true) {
            System.out.println("""
                               -----Employee Management Menu-----
                                1.Add new employee
                                2.Update employee
                                3.Delete employee
                                4.Find employee
                                5.Display all employee
                                0.Exit
                                Select an option:""");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Add Fulltime Employee");
                    System.out.println("2.Add Parttime Employee");
                    int type = scanner.nextInt();
                    if (type == 1) {
                        emp_fulltime fulltime = new emp_fulltime("", "", null, null, 0);
                        fulltime.input();
                        addEmployee(fulltime);
                    } else if (type == 2) {
                        emp_parttime parttime = new emp_parttime("", "", null, null, 0);
                        parttime.input();
                        addEmployee(parttime);
                    }
                    break;
                case 2:
                    System.out.println(" Enter Employee ID to update :");
                    String updateID = scanner.nextLine();
                    updateEmployee(updateID);
                    break;
                case 3:
                    System.out.println("Enter Employee ID to delete :");
                    String deleteID = scanner.nextLine();
                    deleteEmployee(deleteID);
                    break;
                case 4:
                    System.out.println("Enter employ id to find :");
                    String findID = scanner.nextLine();
                    Employee emp = Find(findID);
                    if (emp != null) {
                        emp.output();
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 5:
                    displayAll();
                    break;
                case 0:
                    System.out.println("Exiting ...");
                    return;
                default:
                    System.out.println("Please try again .");
            }
        }
    }
}
