package homework_13.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneMain {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Samsung"));
        phones.add(new Phone("Xiaomi"));
        phones.add(new Phone("Apple"));
        phones.add(new Phone("Huawei"));
        phones.add(new Phone("Nokia"));

        System.out.println("===Main list===");
        System.out.println(phones);

        List<String> producer = phones.stream()
                .map(Phone::getModel)
                // лучше сделать коллекцию из этих слов и вызывать у этой коллекции contains
                .filter(string -> string.contains("Apple") || string.contains("Samsung") || string.contains("Xiaomi"))
                .collect(Collectors.toList());
        System.out.println("===List of producer===");
        System.out.println(producer);
    }
}
