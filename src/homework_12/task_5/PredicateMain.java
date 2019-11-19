package homework_12.task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

// +
public class PredicateMain {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Pasha"));
        users.add(new User("Oleg"));
        users.add(new User("Vlad"));
        users.add(new User("Artur"));

        System.out.println("Original list: " + users);

        Predicate<String> predicate = name -> name.startsWith("A") || name.startsWith("P") || name.startsWith("P");
        deleteUser(predicate, users);
        System.out.println("After: " + users);
    }

    private static void deleteUser(Predicate<String> predicate, List<User> users) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (predicate.test(user.getName())) {
                iterator.remove();
            }
        }
    }
}
