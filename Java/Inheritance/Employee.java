package Inheritance;

public class Employee 
{
    static long employeeId;
    static String employeeName;
    static String employeeAddress;
    static long employeePhone;
    static double basicSalary = 45000;
    static double specialAllowance = 250.80;
    static double hra = 1000.50;
    
    public long id()
    {
        return employeeId;
    }

    public String name()
    {
        return employeeName;
    }

    public String address()
    {
        return employeeAddress;
    }

    public long phone()
    {
        return employeePhone;
    }

    public double salary()
    {
        return basicSalary;
    }

    public double calculateSalary()
    {
        return (basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100));
    }

    public void transportAllowance()
    {
        double transportAllowance = 10 / 100 * basicSalary;

        System.out.println(transportAllowance);
    }
}
