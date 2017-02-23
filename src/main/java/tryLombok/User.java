package tryLombok;

import lombok.*;

/**
 * @author Igor Gnes on 17.02.17.
 */

@Data
public class User {

    private static String name;
    private int age;

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
    }
}
