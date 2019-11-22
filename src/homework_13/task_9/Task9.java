package homework_13.task_9;

import homework_13.task_3.Phone;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task9 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 1700));
        phones.add(new Phone("Apple", 5700));
        phones.add(new Phone("Xiaomi", 400));
        phones.add(new Phone("LG", 150));
        phones.add(new Phone("Xiaomi", 300));
        phones.add(new Phone("Samsung", 1000));
        phones.add(new Phone("LG", 540));
        phones.add(new Phone("ZTE", 100));
        phones.add(new Phone("ZTE", 200));
        phones.add(new Phone("Samsung", 1400));

        List<Phone> appleGroup = phones.stream()
                .filter(phone -> phone.getModel().contains("Apple"))
                .collect(Collectors.toList());
        List<Phone> anotherGroup = phones.stream()
                .filter(phone -> !phone.getModel().contains("Apple"))
                .collect(Collectors.toList());
        List<Phone> concat = Stream.concat(appleGroup.stream(), anotherGroup.stream()).collect(Collectors.toList());
        System.out.println(concat);
    }
}
