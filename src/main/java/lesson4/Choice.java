package lesson4;

import java.util.Scanner;

/**
 * @author Igor Gnes on 23.02.17.
 */
public class Choice {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        new Choice().start();
    }

    private void start() {

        hello();
        try {
            scan();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void hello() {
        System.out.println("Hello");
        System.out.println("1 Exception");
        System.out.println("2 NullPointerException");
        System.out.println("3 ArrayIndexOutOfBoundsException");
    }

    private void scan() throws Exception {

        switch (scanner.nextInt()) {
            case 1:
                throw new Exception("Exception");
            case 2:
                throw new NullPointerException("NullPointerException");
            case 3:
                throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
            default:
                start(); // enter different value
                break;
        }
    }
}
