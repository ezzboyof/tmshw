package homework_13.task_2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("t", "te", "tes", "test", "testers"));
        Optional<String> listStream = list.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(listStream.get());
    }
}
