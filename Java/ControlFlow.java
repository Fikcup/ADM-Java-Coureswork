import java.util.Scanner;

public class ControlFlow 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour(scanner);
        exerciseFive(scanner);
        
        scanner.close();
    }

    public static void exerciseOne()
    {
        int x;
        // x = 7;
        x = 15;

        if (x < 10)
        {
            System.out.println("Less than 10");
        }
    }

    public static void exerciseTwo()
    {
        int x;
        // x = 7;
        x = 15;

        if (x < 10)
        {
            System.out.println("Less than 10");
        }
        else {
            System.out.println("Greater than 10");
        }
    }

    public static void exerciseThree()
    {
        int x;
        // x = 15;
        x = 50;

        if (x < 10)
        {
            System.out.println("Less than 10");
        }
        else if (x > 10 && x < 20)
        {
            System.out.println("Greater than 10");
        }
        else {
            System.out.println("Greater than or equal to 20");
        }
    }

    public static void exerciseFour(Scanner scanner)
    {
        Scanner inputGrade = scanner;
        System.out.println("Input your grade percentage:");
        int gradePercent = inputGrade.nextInt();

        if (gradePercent > 100 || gradePercent < 0)
        {
            System.out.println("Score out of range");
        }
        else if (gradePercent >= 90)
        {
            System.out.println("A");
        }
        else if (gradePercent >= 80)
        {
            System.out.println("B");
        }
        else if (gradePercent >= 70)
        {
            System.out.println("C");
        }
        else if (gradePercent >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }

    public static void exerciseFive(Scanner scanner)
    {
        Scanner inputDayOfWeek = scanner;
        System.out.println("Enter a day of the week using 1 to 7:");
        int dayOfWeek = inputDayOfWeek.nextInt();

        switch(dayOfWeek)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
    }
}
