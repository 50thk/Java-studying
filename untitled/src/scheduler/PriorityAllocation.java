package scheduler;

public class PriorityAllocation implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("Get a call from a customer with a higher rating first");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("Priority distribution to the queue of the highest-skilled counselors");
    }
}
