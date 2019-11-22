package homework_13.task_8;

import homework_13.task_3.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// +
public class Task8 {
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
        Map<String, List<Phone>> modelGroup = phones.stream()
                .collect(Collectors.groupingBy(Phone::getModel));
        System.out.println(modelGroup);
        Set<Map.Entry<String, List<Phone>>> entries = modelGroup.entrySet();
        for (Map.Entry<String, List<Phone>> entry : entries) {
            System.out.println(entry);
        }
    }
}
