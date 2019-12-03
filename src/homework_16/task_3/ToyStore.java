package homework_16.task_3;

// +
public class ToyStore {
    private int numberOfToys;

    public synchronized void putToys() {
        numberOfToys++;
    }

    public int getNumberOfToys() {
        return numberOfToys;
    }
}
