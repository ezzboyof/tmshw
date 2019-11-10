package homework_9.task_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private static final String FILE_PATH = "src/homework_9/task_6/image.jpeg";

    public static void main(String[] args) throws IOException {
        try (FileReader readerText = new FileReader(FILE_PATH);
             BufferedReader bReaderText = new BufferedReader(readerText)) {
            String line;
             // таким образом ты читаешь весь файл, а нужно было только часть с секретным сообщением
            while ((line = bReaderText.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
