package homework_16.task_1;

public class Task1 {
    public static void main(String[] args) {
        MyThread customThread = new MyThread("MyThread");
        customThread.start();
        // не стоит забывать про метод join()
    }
}
