public class Method4 {
    int add() {
        int a = 100;
        int b = 200;
        int res = a + b;
        return res;

    }

    public static void main(String args[]) {
        Method4 jin = new Method4();
        int a = jin.add();
        System.out.print(a);

    }
}