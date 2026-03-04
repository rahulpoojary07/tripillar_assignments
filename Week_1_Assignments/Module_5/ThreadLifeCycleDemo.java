package Module_5;

class LifeCycleThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        LifeCycleThread t = new LifeCycleThread();
        System.out.println("State after creation: " + t.getState()); // NEW
        t.start();
        System.out.println("State after start: " + t.getState()); // RUNNABLE
        Thread.sleep(100);
        System.out.println("State during sleep: " + t.getState()); // TIMED_WAITING
        t.join();
        System.out.println("State after completion: " + t.getState()); // TERMINATED
    }
}
