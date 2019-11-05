package homework_9.task_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {

    private static final String FILE_PATH = "src/homework_9/task_1/text";

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
            fos.write(Arrays.toString(array).getBytes());
            fos.flush();
        } catch (IOException e) {
            System.err.println("Error");
        }
    }
}