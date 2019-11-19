package homework_9.task_5;

import homework_9.task_4.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Task5 {
    public static void main (String [] args){
        try{
            readFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } // абзац между методами
    public static void readFile(){     // void -> Employee
        try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:\\Users\\easys\\IdeaProjects\\tmshw\\src\\homework_9\\task_4\\text"))){
            Employee employee = (Employee) oin.readObject();
            // return employee;
            // а на экран в методе мейн
            System.out.printf(String.valueOf(employee));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
