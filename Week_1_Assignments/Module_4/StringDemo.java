package Module_4;
public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);  // No change
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}