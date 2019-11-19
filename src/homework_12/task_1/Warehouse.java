package homework_12.task_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Warehouse {
    public static void main(String[] args) {
        Set<Box> boxes = new HashSet<>();

        boxes.add(new Box("Gold"));
        LocalDateTime booksTime = LocalDateTime.now();
        System.out.println("First box was added on " + booksTime);
    }
}
