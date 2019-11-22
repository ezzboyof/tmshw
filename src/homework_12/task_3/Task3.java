package homework_12.task_3;

import java.util.function.BinaryOperator;

// +
public class Task3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> numbers = (x, y) -> x * y;
        System.out.println("Result: " + numbers.apply(-3, 5));
        System.out.println("Result: " + numbers.apply(10, 2));
    }
}
