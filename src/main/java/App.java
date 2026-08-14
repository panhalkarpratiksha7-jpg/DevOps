public class App {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static int add(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("Negative number found. Addition not performed.");
            return 0;
        }

        return a + b;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (isPositive(a) && isPositive(b)) {
            int result = add(a, b);
            System.out.println("Addition = " + result);
            System.out.println("Result: true");
        } else {
            System.out.println("Negative number found.");
            System.out.println("Result: false");
        }
    }
}
