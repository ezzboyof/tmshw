package homework_9.task_2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    private static final String FILE_PATH = "src/homework_9/task_2/text";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            for (int i = 0; i < 10000; i++) {
                fw.write("10000 text");
                fw.write("\n");
            }

            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}