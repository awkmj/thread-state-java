import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws InterruptedException {
        
        final List<ThreadState> states = Arrays.asList(
            new ThreadInNewState(),
            new ThreadInRunnableState(),
            new ThreadInBlockedState(),
            new ThreadInTerminatedState(),
            new ThreadInWaitingState()
        );

        states
        .forEach(ThreadState::simulate);
        
        System.exit(0);
    }


}



