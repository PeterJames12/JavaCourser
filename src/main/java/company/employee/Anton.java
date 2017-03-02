package company.employee;

import company.Title;
import company.boss.Boss;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author Igor Gnes on 3/2/17.
 */
public class Anton extends Boss{

    private String name;
    private int salary;


    public static void main(String[] args) {

        Title title = new Title();
        Annotation[] declaredAnnotations = title.getClass().getDeclaredAnnotations();

        if (title.getClass().isAnnotationPresent(Deprecated.class)) {
            System.out.println("is old class");
        }

        Boss boss = new Boss();

        Method[] declaredMethods = boss.getClass().getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

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
