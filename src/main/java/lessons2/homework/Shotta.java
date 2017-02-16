package lessons2.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Igor Gnes on 16.02.17.
 */
public class Shotta {

    public static void main(String[] args) {

        int masLength = 10;
        int oddValue = 0;
        int evenValue = 0;
        int[] mas = new int[masLength];

        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 1 + random.nextInt(100);
            if (mas[i] % 2 == 0) {
                evenValue++;
            } else {
                oddValue++;
            }
        }

        int[] odd = new int[oddValue];
        int[] even = new int[evenValue];

        oddValue = 0;
        evenValue = 0;

        for (int element : mas) {
            if (element % 2 == 0) {
                even[evenValue] = element;
                evenValue++;
            } else {
                odd[oddValue] = element;
                oddValue++;
            }
        }
        System.out.println("Full mas: " + Arrays.toString(mas));
        System.out.println("Even mas: " + Arrays.toString(even));
        System.out.println("Odd mas: " + Arrays.toString(odd));
    }
}

