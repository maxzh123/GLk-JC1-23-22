package by.itAcademy.homeworks.oop.ForTask34;

public class Engineer extends Worker{

    private String post="Инженер";

    public String getPost() {
        return post;
    }

    public Engineer(String name, String surname, int age, int actualWorkingTime, int standardWorkingTime) {
        super(name, surname, age, actualWorkingTime, standardWorkingTime);
    }

    public void work(){
        System.out.println("Следит за тем как делают рабочие");
    }



}
