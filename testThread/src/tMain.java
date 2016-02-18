import java.util.concurrent.TimeUnit;

/**
 * Created by wsc on 16-2-15.
 */
public class tMain {

    public static boolean stopRequested;

    private static synchronized void setStopRequested() {
        stopRequested = true;
    }

    private static synchronized boolean isStopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws Exception {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!isStopRequested())
                    i++;
            }
        });
    }
}




