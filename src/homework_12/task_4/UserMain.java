package homework_12.task_4;

import java.util.function.Supplier;

public class UserMain {
    public static void main(String[] args) {
        try {
            String nameUser = "Dmitriy";
            Supplier<User> userSupplier = () -> new User(nameUser);
            System.out.println(nameUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
