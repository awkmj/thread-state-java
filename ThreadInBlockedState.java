import java.util.logging.Logger;

public class ThreadInBlockedState implements ThreadState {

    private final Logger log = Logger.getLogger(ThreadInBlockedState.class.getName());

    @Override
    public void simulate() {

        try {
            log.info("simulating thread in blocked state");
            
            final Thread t1 = new Thread(new LongTask());
            final Thread t2 = new Thread(new LongTask());

            t1.start();
            t2.start();

            Thread.sleep(1000);
            log.info(String.format("Thread 2 state = %s", t2.getState()));
        } catch (final InterruptedException ex) {
            log.info(String.format("could not process threads, error: %s", ex.getMessage()));
        }
    }

}
