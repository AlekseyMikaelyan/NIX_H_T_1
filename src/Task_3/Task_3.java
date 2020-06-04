package Task_3;

import org.w3c.dom.ls.LSOutput;

public class Task_3 {

    public static int convertToSecond(int hour, int min, int second) {
        return second + (min * 60) + (hour * 60 * 60);
    }

    public static int timeDeference(int a1, int a2, int a3, int b1, int b2, int b3) {
        int deference = convertToSecond(b1, b2, b3) - convertToSecond(a1, a2, a3);
        return deference;
    }
}
