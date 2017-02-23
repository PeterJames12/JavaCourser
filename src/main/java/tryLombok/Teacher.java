package tryLombok;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.Value;
import lombok.val;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author Igor Gnes on 17.02.17.
 */
public class Teacher {

    private static String name = "Alex";

    public static void main(String[] args) {

        val advanceConsolePrinter = new AdvanceConsolePrinter(AdvanceConsolePrinter.class.getSimpleName());
        val igor = "Igor";
        val i = 12;

    }

    @SneakyThrows
    private static void something() {
        File file = new File("");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        @Cleanup
        Scanner scanner = new Scanner(System.in);

    }
}
