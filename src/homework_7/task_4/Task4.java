package homework_7.task_4;

public class Task4 {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested  in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";

        System.out.println("Есть ли в тексте слово " + "alert: " + text.contains("alert"));
        System.out.println("Есть ли в тексте слово " + "add: " + text.contains("add"));
        System.out.println("Есть ли в тексте слово " + "good: " + text.contains("good"));
        System.out.println("Есть ли в тексте слово " + "plan: " + text.contains("plan"));
    }
}
