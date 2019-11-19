package homework_9.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// +
public class Task3 {
    private static final String FILE_PATH = "src/homework_9/task_2/text";

    public static void main(String[] args) throws IOException {
        try (FileReader readerText = new FileReader(FILE_PATH);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;
            while ((line = bReaderText.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
