package by.itAcademy.homeworks.oop.ForTask34;

public class Boss extends Worker{

    private String post="Начальник";

    public String getPost() {
        return post;
    }

    public Boss(String name, String surname, int age, int actualWorkingTime, int standardWorkingTime) {
        super(name, surname, age, actualWorkingTime, standardWorkingTime);
    }

    public void work(){
        System.out.println("Следит за всеми, но больше по шапке получает инженер.");
    }
}
