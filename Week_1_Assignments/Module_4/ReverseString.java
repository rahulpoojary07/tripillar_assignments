package Module_4;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Programming";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + sb);
    }
}