package June_1st_task;

import java.util.Arrays;

public class Largest_Element {
    public static void main(String[] args) {
        int[] numbers = {120,87,54,178,543,6,23};//100,34
        Arrays.sort(numbers);
        // findout the second highest number
        System.out.println(numbers[numbers.length - 1]);

        // smallest number
        System.out.println(numbers[numbers.length-7]);
    }
}
