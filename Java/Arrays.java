public class Arrays {
    public static void main(String[] args)
    {
        problemOne();
        problemTwo();
        problemThree();
        problemFour();
        problemFive();
        problemSix();
        problemSeven();
        problemEight();
        problemNine();
        problemTen();
    }

    public static void problemOne()
    {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void problemTwo()
    {
        int[] arr = {13, 5, 7, 68, 2};

        int lastItem = arr[arr.length - 1];

        int midArr = ((arr[0] + lastItem) / 2);

        System.out.println(midArr);
    }

    public static void problemThree()
    {
        String[] arr = {"red", "green", "blue", "yellow"};
        System.out.println(arr.length);

        String[] arrClone = arr;
        System.out.println(java.util.Arrays.toString(arrClone));
    }

    public static void problemFour()
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        int lastIndex = arr[arr.length - 1];
        int firstIndex = arr[0];

        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }

    public static void problemFive()
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void problemSix()
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println((arr[i] * 2));
        }
    }

    public static void problemSeven()
    {
        String[] arr = {"one", "two", "three", "four", "five"};
        String dontPrint = arr[2];

        for (int i = 0; i < arr.length; i++)
        {
            if (!arr[i].equals(dontPrint))
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void problemEight()
    {
        String[] arr = {"one", "two", "three", "four", "five"};
        
        int arrLast = arr.length - 1;
        int arrMid = (arrLast / 2); 

        String arrTemp = arr[arrMid];
        arr[arrMid] = arr[0];
        arr[0] = arrTemp;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void problemNine()
    {
        int [] arr = { 4, 2, 9, 13, 1, 0};

        java.util.Arrays.sort(arr, 0, arr.length);
        int arrLast = arr.length - 1;
        
        System.out.print("Array in ascending order: ");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == arr[arrLast])
            {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println();
        System.out.println("The smallest number is " + arr[0]);
        System.out.println("The largest number is " + arrLast);
    }

    public static void problemTen()
    {
       Object[] arr = { 3, "banana", "peanut butter", "ice cream", 3.456 };

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}