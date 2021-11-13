package Inheritance;

public class InheritanceActivity 
{
    public static void main(String[] args)
    {
        Manager managerInstance = new Manager();
        Trainee traineeInstance = new Trainee();

        System.out.println(managerInstance.calculateSalary());
        System.out.println(traineeInstance.calculateSalary());
    }
}
