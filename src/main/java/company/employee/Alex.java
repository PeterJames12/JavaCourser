package company.employee;

import company.boss.Boss;

/**
 * @author Igor Gnes on 3/2/17.
 */
public class Alex extends Boss  {

    private String name;
    private int salary;

    private boolean workHard() {
        return true;
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
