package homework_9.task_6;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private static final String FILE_PATH = "src/homework_9/task_6/image.jpeg";

    public static void main(String[] args) throws IOException {
        try (FileWriter fr = new FileWriter(FILE_PATH, true)) {
            // когда записывал в файл, стоило запомнить с какого байта начинается твое сообщение, чтобы потом прочимтать его
            // + кол-во байт в сообщение, чтобы знать сколько байт прочитать
            String text = "\n" + "Area 51";
            fr.write(text);
            fr.flush();
        }
    }
}
