package by.itAcademy.homeworks.oop.Task34;

public class Task34 {
    public static void main(String[] args) {
        Supervisor chief = new Supervisor("Начальник отдела", "Андрей Валентинович");
        Engineer eng1 = new Engineer("Инженер ПТО", "Игорь", 150, 168);
        System.out.println("Chiefs sallary:"+ chief.getSallary()+" Engineer Sallary:"+eng1.getSallary());
        System.out.println("Chief is working: "+chief.toWork());
        System.out.println("Engineer is working: "+eng1.toWork());
    }
}
