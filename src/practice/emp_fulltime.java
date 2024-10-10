package practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class emp_fulltime extends Employee {

    private double coeffcidentsSalary;
    Scanner scanner = new Scanner(System.in);

    public emp_fulltime(double coeffcidentsSalary) {
        this.coeffcidentsSalary = coeffcidentsSalary;
    }

    public emp_fulltime() {
    }

    emp_fulltime(String string, String string0, Object object, Object object0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getCoeffcidentsSalary() {
        return coeffcidentsSalary;
    }

    public void setCoeffcidentsSalary(double coeffcidentsSalary) {
        this.coeffcidentsSalary = coeffcidentsSalary;
    }

    @Override
    public void input() {
        System.out.println("Enter ID");
        setEmpID(empID);
        System.out.println("Enter name :");
        setEmpName(empName);
        System.out.println("Enter empDateOfBirth :");
        String empDateOfBirthString = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date empDateOfBirth = sdf.parse(empDateOfBirthString);
            setEmpDateOfBirth(empDateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong Fomat");
        }
        String startDayString = scanner.nextLine();
        SimpleDateFormat start = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date starday = start.parse(startDayString);
            setStartDate(startDate);
        } catch (Exception e) {
            System.out.println("Wrong Format");
        }
        System.out.println("Enter coefficident :");
        setCoeffcidentsSalary(coeffcidentsSalary);
    }

    @Override
    public void output() {
        System.out.println("Fulltime employee");
        System.out.println("ID :"+ getEmpID());
        System.out.println("Name :"+getEmpName());
        System.out.println("DateOfBirth(dd/MM/yyyy) :"+getEmpDateOfBirth());
        System.out.println("Startday :"+getStartDate());
        System.out.println("Coefficident :"+getCoeffcidentsSalary());
        
    }

    @Override
    public double calculateAllowance() {
        for (int i = 0; i <= 20; i++) {
            int seniority = i;
            if (seniority >= 10) {
                return 1000000;
            } else if (seniority <= 10) {
                return 500000;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public double calculateSalary() {
        return BASIC_SALARY * coeffcidentsSalary + calculateAllowance();
    }

    

}
