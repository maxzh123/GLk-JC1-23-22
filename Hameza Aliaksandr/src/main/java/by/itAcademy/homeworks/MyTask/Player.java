package by.itAcademy.homeworks.MyTask;

public class Player {
    public String name;
    public int age;
    public boolean isActive;

    public Player(String name, int age, boolean isActive){
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }
    public String getName(){return name;};
    public int getAge(){return age;};
    public boolean isActive(){return isActive;};

    public String toString() {
        return name + " " + age + " " + isActive+ " " ;
    }
}
