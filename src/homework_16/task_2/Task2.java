package homework_16.task_2;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("My Thread");
        myThread.start();
        myThread.join();
        System.out.println("Main thread end");
    }
}
