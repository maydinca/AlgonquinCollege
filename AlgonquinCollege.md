# ![Screenshot of a comment on a GitHub issue showing an image, added in the Markdown, of an Octocat smiling and raising a tentacle.](https://myoctocat.com/assets/images/base-octocat.svg)
``````java
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
