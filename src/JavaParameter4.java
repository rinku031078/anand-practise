public class JavaParameter4 {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(10, 100);
        System.out.println(z);
    }
}
