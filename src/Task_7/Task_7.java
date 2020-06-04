package Task_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_7 {

    public static void beatTheFigure() throws IOException {
        int a;
        int b;
        int c;
        int d;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());

        if(a <= 8 && b <= 8 && c <=8 && d <=8) {

            if(a == c || b == d) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
        else {
            System.out.println("По условию задачи, координаты должны быть не больше восьми!");
        }
    }
}
