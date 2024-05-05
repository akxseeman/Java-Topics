
public class Method1 {
    void stringPrint() {
        String s = "java";
        String b = "core";
        System.out.print(s.concat(b));
    }

    public static void main(String[] args) throws Exception {
        Method1 pattern = new Method1();
        pattern.stringPrint();
    }
}
