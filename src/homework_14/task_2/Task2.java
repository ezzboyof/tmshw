package homework_14.task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    private static final String OLD_PATH = "src/homework_14/task_2/text1";
    private static final String NEW_PATH = "src/homework_14/task_2/text2";

    public static void main(String[] args) {
        findPancakesAndWrite(OLD_PATH, NEW_PATH);
    }

    private static void findPancakesAndWrite(String initialPath, String newPath) {
        try (FileReader fileReader = new FileReader(OLD_PATH);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(NEW_PATH, true);
        ) {
            String pancakes;
            while ((pancakes = bufferedReader.readLine()) != null) {
                if (pancakes.toLowerCase().contains("pancakes")) {// константа
                    fileWriter.write(pancakes + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
