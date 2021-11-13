import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
      lottery();
    }

    public static void lottery()
    {
        int lotteryWinningNumber = (int) (Math.random() * 100);
        String winningNumber = Integer.toString(lotteryWinningNumber);

        Scanner inputPromptLottery = new Scanner(System.in);
        System.out.println("Enter a two-digit lottery number:");

        int inputNumber = inputPromptLottery.nextInt();
        String userGuess = Integer.toString(inputNumber);
        inputPromptLottery.close();

        if (userGuess.equals(winningNumber))
        {
            System.out.println("You won $5,000!");
        }
        else if (userGuess.contains(winningNumber.substring(0,1)) &&
                userGuess.contains(winningNumber.substring(1)))
        {
            System.out.println("You won $1,000!");
        }
        else if (userGuess.contains(winningNumber.substring(0,1)) ||
                userGuess.contains(winningNumber.substring(1)))
        {
            System.out.println("You won $250!");
        }
        else 
        {
            System.out.println("You won nothing :(");
        }
    }
}