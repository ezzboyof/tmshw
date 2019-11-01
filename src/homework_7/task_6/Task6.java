package homework_7.task_6;
import java.util.ArrayList;
public class Task6 {
    public static void main(String[] args) {
        String[] arrayWords = {"adfs", "fwefwe", "dwefw", "qwrdfg", "wfsrg", "Wgronmjk"};
        String startLitterinUpCase = "W";
        ArrayList<String> outArray = new ArrayList<>();
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].startsWith(startLitterinUpCase) || arrayWords[i].startsWith(startLitterinUpCase.toLowerCase())) {
                outArray.add(arrayWords[i]);
            }
        }
        System.out.println(outArray);
    }
}
