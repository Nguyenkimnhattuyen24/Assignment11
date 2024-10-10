package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class emp_parttime extends Employee {

    private int numberOfWorkdays;

    public emp_parttime(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public emp_parttime() {
    }

    emp_parttime(String string, String string0, Object object, Object object0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
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
        } catch (ParseException e) {
            System.out.println("Wrong Fomat");
        }
        String startDayString = scanner.nextLine();
        SimpleDateFormat start = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date starday = start.parse(startDayString);
            setStartDate(startDate);
        } catch (ParseException e) {
            System.out.println("Wrong Format");
        }
        System.out.println("Enter Number of workday :");
        int workday = scanner.nextInt();
    }

    @Override
    public void output() {
        System.out.println("Fulltime employee");
        System.out.println("ID :" + getEmpID());
        System.out.println("Name :" + getEmpName());
        System.out.println("DateOfBirth(dd/MM/yyyy) :" + getEmpDateOfBirth());
        System.out.println("Startday :" + getStartDate());
        System.out.println("Number of workday :"+getNumberOfWorkdays());
    }

    @Override
    public double calculateAllowance() {
        for (int i = 0; i <= 20; i++) {
            int seniority = i;

            if (seniority >= 10) {
                return 50000;
            } else if (seniority <= 10) {
                return 30000;
            }
        }
        return 0;
    }

    @Override
    public double calculateSalary() {
        return (BASIC_SALARY * numberOfWorkdays) / 26 + calculateAllowance();
    }

}
