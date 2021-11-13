public class DeclaringVariables
{
    public static void main(String[] args)
    {
        variableExerciseOne();

        variableExerciseTwo();

        variableExerciseThree();

        variableExerciseFour();

        variableExerciseFive();

        variableExerciseSix();

        variableExerciseSeven();

        cafeExercise();
    }

    private static void variableExerciseOne()
    {
        int variableOne = 7;
        int variableTwo = 9;

        int sum = variableOne + variableTwo;

        System.out.println(sum);
    }

    private static void variableExerciseTwo()
    {
        double variableOne = 3.4566;
        double variableTwo = 7.234;

        double sum = variableOne + variableTwo;

        System.out.println(sum);
    }

    private static void variableExerciseThree()
    {
        int variableOne = 5;
        double variableTwo = 3.765;

        double sum = variableOne + variableTwo;

        System.out.println(sum);
    }

    private static void variableExerciseFour()
    {
        int variableOne, variableTwo;

        variableOne = 7;
        variableTwo = 3;

        int answer = variableOne / variableTwo;

        System.out.println(answer);
    }

    private static void variableExerciseFive()
    {
        double variableOne, variableTwo;

        variableOne = 7.2345;
        variableTwo = 2.34567;

        double answer = variableOne / variableTwo;

        System.out.println(answer);

        double answerInt = variableOne / variableTwo;

        System.out.println(answerInt);
    }

    private static void variableExerciseSix()
    {
        int x, y;

        x = 5;
        y = 6;

        int q = y / x;

        System.out.println(q);

        double z = (double)y;

        double a = z / x;

        System.out.println(a);
    }

    private static void variableExerciseSeven()
    {
        final int DECLARE_CONSTANT = 7;

        int y = 9;

        int sum = DECLARE_CONSTANT + y;

        System.out.println(sum);
    }

    private static void cafeExercise()
    {
        double coffee = 5.62;
        double tea = 2.25;
        double coffeeBeans = 20.31;

        double subTotal;
        double totalSale;

        final double SALES_TAX = 1.10;

        subTotal = 3 * coffee + 4 * tea + 2 * coffeeBeans;

        totalSale = subTotal * SALES_TAX;

        System.out.println(totalSale);
    }
}