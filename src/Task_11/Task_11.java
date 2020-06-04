package Task_11;

import Task_9.Task_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_11 {

    public static void swapArrayElements() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int capacity = Integer.parseInt(reader.readLine());
        int [] array = new int[capacity];

        Task_9.arrayFilling(array);

        for(int i = 0; i < array.length-1; i+=2) {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
