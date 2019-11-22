package homework_13.task_10;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// +
public class Task10 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 1700));
        phones.add(new Phone("Apple", 5700));
        phones.add(new Phone("Xiaomi", 400));
        phones.add(new Phone("Xiaomi", 300));
        phones.add(new Phone("Samsung", 1000));
        phones.add(new Phone("LG", 540));
        phones.add(new Phone("ZTE", 100));
        phones.add(new Phone("Samsung", 1400));

        Map<String, Long> grouping = phones.stream()
                .collect(Collectors.groupingBy(Phone::getModel, Collectors.counting()));

        for (Map.Entry<String, Long> entry : grouping.entrySet()) {
            System.out.println(entry);
        }
    }
}
