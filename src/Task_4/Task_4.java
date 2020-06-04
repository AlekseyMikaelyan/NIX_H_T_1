package Task_4;

public class Task_4 {

    public static int numberOfDays(int n, int m) {
        int days = m / n;
        int plusDay = 0;

        plusDay = ((m % n) != 0) ? (plusDay + 1) : plusDay;
        days += plusDay;
        return days;
    }
}
