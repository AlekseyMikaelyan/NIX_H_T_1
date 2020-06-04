package Task_1;

public class Task_1 {
    public static void swapTwoNumbers(int a, int b) {
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println("Result - " + a + ", " + b);
    }
}
