package practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.lang.model.util.SimpleAnnotationValueVisitor14;
import practice.IEmployee;

public abstract class Employee implements IEmployee {

    String empID;
    String empName;
    Date empDateOfBirth;
    Date startDate;
    Scanner scanner = new Scanner(System.in);

    public Employee(String empID, String empName, Date empDateOfBirth, Date startDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateOfBirth = empDateOfBirth;
        this.startDate = startDate;
    }

    public Employee() {
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateOfBirth() {
        return empDateOfBirth;
    }

    public void setEmpDateOfBirth(Date empDateOfBirth) {
        this.empDateOfBirth = empDateOfBirth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public abstract double calculateSalary();

    @Override
    public abstract double calculateAllowance();

    public abstract void input();

    public abstract void output();
    
//    void input() {
//        System.out.println("Enter empID :");
//        String empID = scanner.nextLine();
//        setEmpID(empID);
//        System.out.println("Enter empName :");
//        String empName = scanner.nextLine();
//        setEmpName(empName);
//        System.out.println("Enter empDateOfBirth :");
//        String empDateOfBirthString = scanner.nextLine();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            Date empDateOfBirth = sdf.parse(empDateOfBirthString);
//            setEmpDateOfBirth(empDateOfBirth);
//        } catch (Exception e) {
//            System.out.println("Wrong Fomat");
//        }
}
