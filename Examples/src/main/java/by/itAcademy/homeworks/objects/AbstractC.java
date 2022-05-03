package by.itAcademy.homeworks.objects;

public abstract class AbstractC {
    private String xx="Опачки";

    public abstract String getName();

    public void sayHello(){
        System.out.println(xx+"Привет! Я "+this.getName());
    }

    public static void work(){
        System.out.println("Привет! AbstractC");
    }
}
