package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.ForTask34.ChiefAccountant;
import by.itAcademy.homeworks.oop.ForTask34.EmployeeOrg;

public class Task34 {

    /**Task34
     * Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
     * Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная).
     * Иерархия должна иметь хотя бы три уровня.
     */

    public static void main(String[] args) {
        ChiefAccountant ca = new ChiefAccountant(100_000);
        EmployeeOrg driver = new EmployeeOrg("Driver D.D", "hours");
        driver.working();
        ca.calculate(driver);

        EmployeeOrg boss = new EmployeeOrg("Boss B.B", "mix");
        boss.working();
        ca.calculate(boss);
    }
}
