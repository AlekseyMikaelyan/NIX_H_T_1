package Task_6;

public class Task_6 {
    public static int compareTwoNumbers(int a, int b) {
        int max = a - ((a - b) & ((a - b) >> 31));
        return max;
    }
}
