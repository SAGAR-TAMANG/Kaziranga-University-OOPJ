import java.util.Arrays;
import java.util.Collections;

public class Question3Part1 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        int target = 9;
        boolean found = false;

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }
}
