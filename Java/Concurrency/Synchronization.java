package Concurrency;

public class Synchronization extends Thread
{
    public static void main(String[] args)
    {
        try 
        {
            Thread c = new Synchronization();

            Thread thread = new Thread(new Synchronization(), "thread1");
            Thread thread2 = new Thread(c, "thread2");
            thread.start();
            thread2.start();
            System.out.println("Threads are running.");

            thread.join();
            thread2.join();
            System.out.println("Threads have finished.");

            System.out.print(c);
        } catch (InterruptedException e) 
        {
            System.out.println("Interuptted");
        }
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 1000000000; i++)
        {
            System.out.println(thread + ": " + i);
            System.out.print(thread2 + ": " + i);
        }
    }
}