import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testmain extends Thread {
    static long sTime = System.currentTimeMillis();
    public static void main(String[] args)
    {
                            throws InterruptedException {
            Test mt = new test();
            Test.sleep(2000);
            mt.start();

            long timeSleep = System.currentTimeMillis() - testmain.sTime;

            System.out.printf("Main slept %tS s%n", timeSleep);
        }
    }
}
