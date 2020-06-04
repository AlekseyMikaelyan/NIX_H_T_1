package Task_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_8 {

    public static void coincidence() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer i1 = Integer.parseInt(reader.readLine());
        Integer i2 = Integer.parseInt(reader.readLine());
        Integer i3 = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);

        if(list.get(0).equals(list.get(1)) && list.get(0).equals(list.get(2))){
            System.out.println(3);
        }
        else if(list.get(0).equals(list.get(1))) {
            System.out.println(2);
        }
        else if(list.get(1).equals(list.get(2))) {
            System.out.println(2);
        }
        else if(list.get(2).equals(list.get(0))) {
            System.out.println(2);
        }
        else {
            System.out.println(0);
        }
    }
}
