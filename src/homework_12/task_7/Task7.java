package homework_12.task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        Comparator<String> stringComparator = (String first, String second) -> -first.compareTo(second); // -first.compareTo(second) -> -1 * first.compareTo(second) так виднее
        List<String> stringList = new ArrayList<>();
        stringList.add("Happy");
        stringList.add("New");
        stringList.add("Year");
        stringList.sort(stringComparator);
        System.out.println("Result: " + stringList);
    }
}
