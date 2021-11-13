public class Loops 
{
    public static void main(String [] args)
    {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
        exerciseSeven();
        exerciseEight();
    }

    public static void exerciseOne()
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i);
        }
    }

    public static void exerciseTwo()
    {
        int i = 0;

        do 
        {
            System.out.println(i);
            i+=10;
        }
        while (i < 100);
    }

    public static void exerciseThree()
    {
        int i = 1;

        do 
        {
            System.out.println(i);
            i+=10;
        }
        while (i < 10);
    }

    public static void exerciseFour()
    {
        for (int i = 0; i < 100; i++)
        {
            if (i > 25 && i < 75)
            {
                continue;
            }

            if (i % 5 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void exerciseFive()
    {
        int weeks = 2;
        int days = 7;

        for (int i = 1; i <= weeks; i++)
        {
            System.out.println("Week: " + i);

            for (int j = 1; j <= days; j++)
            {
                System.out.println("Day: " + j);
            }
        }
    }

    public static void exerciseSix()
    {
        for (int i = 10; i < 200; i++)
        {
            String toTest = String.valueOf(i);

            char[] testArr = toTest.toCharArray();
            boolean isPali = false;

            for (int j = 0, k = testArr.length - 1; j < testArr.length; j++, k--)
            {
                if (testArr[j] != testArr[k])
                {
                    break;
                }
                isPali = true;
            }

            if (isPali)
            {
                System.out.println(toTest + ", ");
            }
        }
    }

    public static void exerciseSeven()
    {
        long f1 = 0;
        long f2 = 1;

        System.out.println(f1);
        System.out.print(f2);

        for (int i = 3; i < 50; i++)
        {
            long f3 = f1 + f2;
            System.out.println(f3);

            f1 = f2;
            f2= f3;
        }
    }

    public static void exerciseEight()
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println("i: " + i + ",j: " + j);
            }
        }
    }
}