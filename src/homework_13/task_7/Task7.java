package homework_13.task_7;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", 1700));
        phones.add(new Phone("Xiaomi", 400));
        phones.add(new Phone("LG", 150));
        phones.add(new Phone("Samsung", 1000));
        phones.add(new Phone("ZTE", 100));
        System.out.println(phones);
        Optional<Phone> min = phones.stream().min(Comparator.comparing(Phone::getPrice));
          // не стоит просто печатать Optional, данные лучше извлечь
        System.out.println("Min price: " + min);
    }
}
