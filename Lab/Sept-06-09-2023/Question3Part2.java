import java.util.Arrays;
import java.util.Collections;

public class Question3Part2 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 5, 6};

        // Sort in ascending order
        Arrays.sort(numbers);
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        // Sort in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
}