public class JavaParameter1 {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Anand", 5);// Anand is 5
        myMethod("Het", 8); // Het is 8
        myMethod("Hetvi", 31); // Hetvi is 31
    }
}
