import java.util.logging.Logger;

public class ThreadInNewState implements ThreadState {

    final Logger log = Logger.getLogger(ThreadInNewState.class.getName());

    @Override
    public void simulate() {
        log.info("simulating thread in new state");

        final Thread t1 = new Thread(new Task());
        final Thread t2 = new Thread(new Task());

        log.info(String.format("Thread 1 state = %s", t1.getState()));
        log.info(String.format("Thread 2 state = %s", t2.getState()));
    }

}
