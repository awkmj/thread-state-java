import java.util.logging.Logger;

public class ThreadInTerminatedState implements ThreadState {

    private final Logger log = Logger.getLogger(ThreadInTerminatedState.class.getName());
    
    @Override
    public void simulate() {

        try {

            log.info("simulating thread in terminated state");

            final Thread t1 = new Thread(new Task());
            final Thread t2 = new Thread(new Task());

            t1.start();
            t2.start();

            Thread.sleep(2000);

            log.info(String.format("Thread 1 state = %s", t1.getState()));
            log.info(String.format("Thread 2 state = %s", t2.getState()));

        } catch (final InterruptedException ex) {

            log.info(String.format("could not execute thread processing, error: %s", ex.getMessage()));
        }
    }

}
