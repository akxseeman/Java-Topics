
public class String1 {
    public static void main(String args[]) {
        String s = "java";
        String d = "java";
        stringExample(s, d);
    }

    static void stringExample(String s, String d) {
        if (s == d) {
            System.out.print("references are equal");
        } else {
            System.out.print("references are not equal");
        }
    }
}
