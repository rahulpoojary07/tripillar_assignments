package Module_4;

class StaticDemo {
    static int count = 0;
    StaticDemo() {
        count++;
    }
    static void showCount() {  // Static method
        System.out.println("Object Count: " + count);
    }
}
public class StaticEx {
    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();
        StaticDemo.showCount();
    }
}