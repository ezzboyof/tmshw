package homework_16.task_1;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        // 10 лучше через конструктор
        for (int i = 0; i <= 10; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("Finished" + name);
    }
}
