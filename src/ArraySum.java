public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Intentional error: Incorrect loop condition (i <= numbers.length)
        for (int i = 0; i <= numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of the array elements: " + sum);
    }
}
