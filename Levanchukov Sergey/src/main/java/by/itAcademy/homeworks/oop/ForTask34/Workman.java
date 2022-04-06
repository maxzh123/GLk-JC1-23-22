package by.itAcademy.homeworks.oop.ForTask34;

public class Workman extends Worker{

    private String post="Рабочий";

    public String getPost() {
        return post;
    }

    public Workman(String name, String surname, int age, int actualWorkingTime, int standardWorkingTime) {
        super(name, surname, age, actualWorkingTime, standardWorkingTime);
    }

    public void work(){
        System.out.println("Делает то что надо делать руками");
    }
}
