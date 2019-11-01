package homework_7.task_8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] carMark = new String[4];
        carMark[0] = "1.8";
        carMark[1] = "1.4";
        carMark[2] = "1.8";
        carMark[3] = "1.4";

        for (int i = 0; i < carMark.length; i++) {
            if (carMark[i] == "1.4") {
                carMark[i] = carMark[i].replace(carMark[i], "2.0T");
            }
            if (carMark[i] == "1.8") {
                carMark[i] = carMark[i].replace(carMark[i], "1.8Т");
            }
        }
        System.out.println(Arrays.toString(carMark));
    }
}
