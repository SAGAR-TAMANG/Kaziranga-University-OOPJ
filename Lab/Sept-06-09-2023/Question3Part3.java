import java.util.Arrays;
import java.util.Collections;

public class Question3Part3 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}