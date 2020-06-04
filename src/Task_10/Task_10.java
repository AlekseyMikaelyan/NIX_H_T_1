package Task_10;

import Task_9.Task_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_10 {

    public static void checkNeighbors() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int capacity = Integer.parseInt(reader.readLine());
        int[] array = new int[capacity];

        Task_9.arrayFilling(array);

        int count = 0;
        for(int i = 0; i < array.length-2; i++) {
            if(array[i+1] > array[i] && array[i+1] > array[i+2]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
