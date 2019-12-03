package homework_16.task_3;

public class Task3 {
    private static ToyStore toyStore;

    public static void main(String[] args) throws InterruptedException {
        toyStore = new ToyStore();

        Thread provideFirst = putToy(100);
        Thread provideSecond = putToy(50);

        provideFirst.start();
        provideFirst.start();

        provideSecond.join();
        provideSecond.join();

        System.out.println("Toys in the shop: " + toyStore.getNumberOfToys());

    }

    private static Thread putToy(int numberOfToys) {
        Runnable runnable = () -> {
            for (int i = 0; i < numberOfToys; i++) {
                toyStore.putToys();
            }
        };
        return new Thread(runnable);
    }
}
