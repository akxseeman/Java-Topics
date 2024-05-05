
public class Method2 {
    void personAge(String a, int b) {
        System.out.print("The student name is " + a + " and is age " + b);

    }

    public static void main(String args[]) {
        String s = "Seeman";
        int a = 21;
        Method2 jin = new Method2();
        jin.personAge(s, a);
    }
}
