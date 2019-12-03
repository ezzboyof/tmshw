package homework_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\easys\\IdeaProjects\\tmshw\\src\\homework_14\\task_5\\Text";
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Maks"));
        cats.add(new Cat("Markiza"));
        cats.add(new Cat("Bobby"));
        serializableObject(path, cats);
        deserializableObject(path);
    }

    public static void serializableObject(String path, List<Cat> cats) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cats);
        oos.close();
    }

    // <cats> - это зачем?
    // throws IOException, ClassNotFoundException - у тебя есть блок catch  с этим исключения, throws надо убрать
    public static <cats> void deserializableObject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            List<Cat> cats = (List<Cat>) ois.readObject();
            System.out.println(cats);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
