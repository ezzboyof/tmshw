package homework_14.task_6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {
        int[] arrayFirst = {1, 4, 5};
        int[] arraySecond = {0, 2, 3, 6};
        int[] result = IntStream.concat(Arrays.stream(arrayFirst), Arrays.stream(arraySecond)).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
