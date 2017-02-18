package lessons2.homework.builder;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Igor Gnes on 18.02.17.
 */
public class BuilderMas {

    private static int counterFor;
    private static int counterForEach;
    private static int counterWhile;
    private static int counterRecursion;

    public static void main(String[] args) {

        appendValueFromMassive(10);
    }

    private static void appendValueFromMassive(int value) {

        final int[] mas = new int[value];

        final Random random = new Random();
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 10 + random.nextInt(100);
        }

        System.out.println("Random mas: " + Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            counterFor += mas[i];
        }
        System.out.println("Sum by for: " + counterFor);

        for (int element : mas) {
            counterForEach += element;
        }
        final char[] chars = builder();

        for (char element : chars) {
            stringBuilder.append(element);
        }
        System.out.println("Sum by forEach & StringBuilder: " + stringBuilder.toString());

        int helper = 0;
        while (helper < mas.length) {
            counterWhile += mas[helper];
            helper++;
        }
        System.out.println("Sum by while: " + counterWhile);

        rec(mas, mas.length - 1);

        System.out.println("Sum by recursion: " + counterRecursion);
    }

    private static void rec(int[] arr, int i) {

        if (i >= 0) {
            counterRecursion += arr[i];
            rec(arr, i - 1);
        }
    }

    private static char[] builder() {

        final String length = String.valueOf(counterFor);

        return length.toCharArray();
    }
}
