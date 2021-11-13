import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args)
    {
        calculator();
    }

    public static void calculator()
    {
        Scanner height = new Scanner(System.in);
        System.out.println("Please enter your height in inches:");
        int userHeight = height.nextInt();
        height.close();

        Scanner weight = new Scanner(System.in);
        System.out.println("Please enter your weight in lbs:");
        int userWeight = weight.nextInt();
        weight.close();

        float userBMI = (userWeight * 703) / (userHeight * userHeight);

        if (userBMI < 18.5)
        {
            System.out.println("User is underweight.");
        }
        else if (userBMI < 25.0)
        {
            System.out.println("User is normal.");
        }
        else if (userBMI < 30.0)
        {
            System.out.println("User is overweight.");
        }
        else
        {
            System.out.println("User is obese.");
        }
    }
}
