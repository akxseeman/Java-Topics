public class Method3 {
    boolean compareString(String a, String b) {
        boolean c = a.equalsIgnoreCase(b);
        return c;
    }

    public static void main(String args[]) {
        String s1 = new String("Seeman");
        String s2 = new String("SEEMAN");
        Method3 jin = new Method3();
        boolean res=jin.compareString(s1, s2);
        System.out.print(res);
    }
}
