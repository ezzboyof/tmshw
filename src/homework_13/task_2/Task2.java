package homework_13.task_2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("t", "te", "tes", "test", "testers"));
        Optional<String> listStream = list.stream()
                .max(Comparator.comparingInt(String::length));
         // а если в коллекция будет пустой? будет исключение, когда ты вызовешь метод get(), добавь проверку
        System.out.println(listStream.get());
    }
}
