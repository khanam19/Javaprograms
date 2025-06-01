package June_1st_task;

public class Sum_Array {
    public static void main(String[] args) {

        int[] numbers = {57, 100, 67};
        int sum = 0; // ->12 + 34 + 10 ->56
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }


        System.out.println(sum);
    }
}
