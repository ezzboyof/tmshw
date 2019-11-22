package homework_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("easy");
        listString.add("hard");
        listString.add("desktop");
        listString.add("manager");
        listString.add("homework");

        List<String> streamList = listString.stream()
                .filter(strings -> strings.length() > 5)
                .collect(Collectors.toList());
        System.out.println(streamList);
    }
}
