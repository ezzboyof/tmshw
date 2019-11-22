package homework_13.task_6;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;

// +
public class Task6 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple"));
        phones.add(new Phone("Apple"));
        phones.add(new Phone("Samsung"));
        phones.add(new Phone("ZTE"));
        phones.add(new Phone("Xiaomi"));
        phones.add(new Phone("ZTE"));
        phones.add(new Phone("LG"));
        phones.add(new Phone("LG"));

        System.out.println(phones);

        phones.stream().distinct().forEach(System.out::println);
    }
}
