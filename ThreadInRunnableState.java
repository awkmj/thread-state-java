import java.util.logging.Logger;

public class ThreadInRunnableState implements ThreadState {

    final Logger log = Logger.getLogger(ThreadInRunnableState.class.getName());

    @Override
    public void simulate() {
        
        log.info("simulating thread in runnable state");
        final Thread t1 = new Thread(new Task());
        t1.start();

        log.info(String.format("Thread 1 state = %s", t1.getState()));
    }
    
}
