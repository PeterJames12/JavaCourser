package company.boss;

import company.employee.Alex;
import company.employee.Anton;
import company.employee.Jackie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Igor Gnes on 3/2/17.
 */
public class Boss {

    private String name;
    private int salary;


    public static void main(String[] args) throws Exception {

        superMethod(Alex.class);
        superMethod(Anton.class);
        superMethod(Jackie.class);

    }

    private static void superMethod(Class<? extends Boss> item) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        String simpleName = item.getSimpleName();

        if ("Alex".equals(simpleName)) {
            Alex alex = new Alex();
            int extraSalary = 0;
            alex.setName("Alex");
            alex.setSalary(2000);

            Method workHard = alex.getClass().getDeclaredMethod("workHard");
            workHard.setAccessible(true);
            boolean invoke = (boolean) workHard.invoke(alex);
            if (invoke) {
                extraSalary = 500;
            }
            printSalary(alex.getSalary() + extraSalary);
        }
        if ("Anton".equals(simpleName)) {
            Anton anton = new Anton();
            anton.setName("Anton");
            anton.setSalary(24000);
            printSalary(anton.getSalary());
        }
        if ("Jackie".equals(simpleName)) {
            Jackie jackie = new Jackie();
            jackie.setName("Jackie");
            jackie.setSalary(2000000);
            printSalary(jackie.getSalary());
        }
    }

    private static void printSalary(int salary) {
        System.out.println(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
