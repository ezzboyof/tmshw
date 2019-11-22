package homework_12.task_2;

public class ParseMain {
    public static void main(String[] args) {
        Parse parse = integer -> integer + " RUB";
        String result = showRUB(parse, 100);
        System.out.println(result);
    }

    // showRub ili parse
    private static String showRUB(Parse parse, int value) {
        return parse.showRUB(value);
    }
}
