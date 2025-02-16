import java.util.logging.Logger;

public class ThreadInWaitingState implements ThreadState {

    private final Logger log = Logger.getLogger(ThreadInWaitingState.class.getName());
    
    @Override
    public void simulate() {
        
        try {
            log.info("simulating thread in waiting state");
            final Thread t1 = new Thread(new Task());
            final Thread t2 = new Thread(new Task());

            t1.start();
            t2.start();

            log.info(String.format("Thread 2 state = %s", t2.getState()));
        }
        catch(final Exception ex) {

        }
    }
    
}
