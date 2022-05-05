package by.itAcademy.homeworks.oop.forTask34;

/**
 *  Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * > должностную структуру на заводе. Реализовать методы по начислению зарплаты в
 * > зависимости от должности (почасовая, процентная, смешанная). Иерархия должна
 * > иметь хотя бы три уровня.
 */

public class Task34 {
    public static void main(String[] args) {
        ITguy a=new ITguy("aw","it",900,Currency.USD,12200,14000,850);
        a.getSalary();
        Loader ab=new Loader("awd","awd",1200,Currency.BYN,221,130);
        ab.getSalary();
    }
}
