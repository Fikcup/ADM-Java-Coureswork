class Test extends Thread {
    public void run()
    {
        long timeSleep = System.currentTimeMillis() - Main.sTime;

        System.out.printf("test slept %tS s%n", timeSleep);
    }
}
