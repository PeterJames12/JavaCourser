package lessons2.homework.builder;

/**
 * @author Igor Gnes on 18.02.17.
 */
public class BuildValue {

    public static void main(String[] args) {

        final StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello ")
                .append("my ")
                .append("name ")
                .append("is ")
                .append("Igor ")
                .append("i ")
                .append("like ")
                .append("Java");

        final String builder = stringBuilder.toString();
    }
}
