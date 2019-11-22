package homework_13.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 2, 5, 12, 25, 20, 32));
        Optional<Integer> multiplication = numbers.stream()
                .limit(5)
                .reduce((x, y) -> x * y);
        // не стоит просто печатать Optional, данные лучше извлечь
        System.out.println(multiplication);
    }
}
