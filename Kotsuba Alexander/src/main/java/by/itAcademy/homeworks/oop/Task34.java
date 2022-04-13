/*Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная, смешанная).
Иерархия должна иметь хотя бы три уровня.*/

package by.itAcademy.homeworks.oop;

public class Task34 {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Инженер по бурению","Сашка",100,210);
        engineer.getSalary();
        engineer.getInfo();
        Handyman handyman = new Handyman("Сторож","Вася");
        handyman.getSalary();
        handyman.getInfo();
    }
}
