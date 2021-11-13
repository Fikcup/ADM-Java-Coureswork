package Concurrency;

public class CreatingAndJoining extends Thread
{
    public static void main(String[] args)
    {
        Thread thread = new CreatingAndJoining();
        thread.start();
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Hello World! " + (i + 1));
        }
    }
}