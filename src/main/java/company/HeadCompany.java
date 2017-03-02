package company;

import company.boss.Boss;

import java.io.IOException;

/**
 * @author Igor Gnes on 3/2/17.
 */
public class HeadCompany {

    public static void main(String[] args) throws IOException {

        Boss boss = new Boss();

        boss.setName("Boss");
        boss.setSalary(3200);

        printSalary(boss);

    }

    private static void printSalary(Boss boss) {

        System.out.println(boss.getSalary());
    }
}
