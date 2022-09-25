package scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void main(String[] args) throws IOException {
        // R, L, P

        System.out.println("choose distribution way. R, L, P");

        int ch = System.in.read();
        Scheduler scheduler = null;

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        }
        else if(ch == 'L' || ch == 'l') {
            scheduler = new Leastjob();
        }
        else if(ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        }
        else {
            System.out.println("did'nt support");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
