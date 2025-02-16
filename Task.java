import java.util.logging.Logger;

public class Task implements Runnable {

    private final Logger log = Logger.getLogger(Task.class.getName());

    @Override
    public void run() {
        log.info("simple task running");
    }

}
