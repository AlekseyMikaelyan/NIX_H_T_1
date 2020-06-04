package Task_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {


    public static int [] arrayFilling(int [] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        String [] stringArray;
        stringArray = s.split(" ");

        for(int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        return array;
    }

    public static void compare() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int capacity = Integer.parseInt(reader.readLine());
        int [] array = new int[capacity];

        arrayFilling(array);

        int count1 = 0;
        int first = array[0];
        for(int i = 1; i < array.length; i++) {
            if(first < array[i]) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
