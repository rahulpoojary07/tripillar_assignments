package Module_5;
class Resource {
    String name;
    Resource(String name) {
        this.name = name;
    }
}
public class DeadlockDemo {
    public static void main(String[] args) {
        final Resource r1 = new Resource("Resource1");
        final Resource r2 = new Resource("Resource2");
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread1 locked r1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (r2) {
                    System.out.println("Thread1 locked r2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread2 locked r2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (r1) {
                    System.out.println("Thread2 locked r1");
                }
            }
        });
        t1.start();
        t2.start();
    }
}