package by.itAcademy.homeworks.oop.Task34;

/**
 * Задание 34
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
 * Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная).
 * Иерархия должна иметь хотя бы три уровня.
 */

public class Task34 {
    public static void main(String[] args) {
        DeputyForProduction deputyForProduction = new DeputyForProduction(700.5f,175.5f,900.5f,95.5f);
        deputyForProduction.salaryCalculation();
        System.out.println(deputyForProduction.toString());
        Master master = new Master(500.5f, 150.5f, 500.5f, 95.5f);
        System.out.println("Мастеру начислено: " + master.salaryCalculation());
        Worker worker = new Worker(300.5f, 175.5f, 300, 2.5f);
        worker.salaryCalculation();
        System.out.println(worker.toString());
    }
}
