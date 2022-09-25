package scheduler;

public class Leastjob implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("Get the call from the queue in order.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("Assign to a counselor who does not currently have a call or has the least wait for a call");
    }
}
