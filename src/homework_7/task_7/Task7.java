package homework_7.task_7;

public class Task7{
    public static void main(String[] args) {
        int counter = 100000;
        String testString = "Test";
        String concatString = "test";

        long start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            testString = testString.concat(concatString);
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("String; " + time);

        StringBuilder testStringBuilder = new StringBuilder("Test");
        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            testStringBuilder.append(concatString);
        }
        time = System.currentTimeMillis() - start;
        System.out.println("StringBuilder; " + time);

        StringBuffer testStringBuffer = new StringBuffer("Test");
        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            testStringBuffer.append(concatString);
        }
        time = System.currentTimeMillis() - start;
        System.out.println("StringBuffer; " + time);
    }
}
