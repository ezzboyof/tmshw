package homework_9.task_4;

import java.io.Serializable;

// +
public class Employee implements Serializable {
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    public Work work;

    public Employee(String name, int age, Work work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.work = new Work();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work=" + work +
                '}';
    }
}
