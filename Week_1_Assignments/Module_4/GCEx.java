package Module_4;

class GarbageDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected");
    }
}
public class GCEx {
    public static void main(String[] args) {
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();
        obj1 = null;
        obj2 = null;
        System.gc();
        System.out.println("End of main");
    }
}