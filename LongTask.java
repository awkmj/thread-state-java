import java.time.LocalTime;
import java.util.logging.Logger;

public class LongTask extends Task {
    
    private final Logger log = Logger.getLogger(LongTask.class.getName());

    @Override
    public void run() {
        log.info("performing long execution");
    
        longExecution();
    }

    public static synchronized void longExecution() {

        final LocalTime expiryTime = LocalTime
        .now().plusSeconds(10);

        while(true) {

            final LocalTime currentTime = LocalTime.now();
            if (currentTime.isAfter(expiryTime)) {
                
                break;
            }
        }
    }
}
