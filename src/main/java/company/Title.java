package company;

/**
 * @author Igor Gnes on 3/2/17.
 */

@Deprecated
public class Title {

    public static void main(String[] args) {

        Test<String, String> values = new Test<>();

        values.setKey("key");
        values.setValue("Value");

        Test<Integer, Integer> integerValue = new Test<>();

        integerValue.setKey(34);
        integerValue.setValue(656);


        Test<String, Integer> mix = new Test<>();

        mix.setKey("Key");
        mix.setValue(25332657);

        printValues(values);
        printValues(integerValue);
        printValues(mix);
    }

    private static void printValues(Test<?, ?> item) {

        System.out.println(item.getKey());
        System.out.println(item.getValue());
    }
}
