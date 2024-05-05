
public class Stringcompare {
    public static void main(String args[]) {
        String s = new String("java");
        String d = new String("java");
        stringExample(s, d);
        stringExample2(s, d);
    }

    static void stringExample(String s, String d) {
        if (s == d) {
            System.out.print("references are equal");
        } else {
            System.out.print("references are not equal");
        }
    }

    static void stringExample2(String s, String d) {
        if (s.equals(d)) {
            System.out.print("values are equal");
        } else {
            System.out.print("values are not equal");
        }
    }
}