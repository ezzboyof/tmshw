package homework_7.task_9;

public class Task9 {
    public static void main(String[] args) {
        String[] array = {"arsdgd", "greufhf", "gds", "sytry", "teragjy"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 5) {
                System.out.println(array[i]);
            }
        }
    }
}
