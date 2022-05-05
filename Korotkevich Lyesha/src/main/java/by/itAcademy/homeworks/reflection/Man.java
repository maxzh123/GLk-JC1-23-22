package by.itAcademy.homeworks.reflection;

public class Man {
    private int age;
    private float weight;
    private float height;

    public Man(int age, float weight, float height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    private int getAge() {
        return age;
    }

    private float getWeight() {
        return weight;
    }

    private float getHeight() {
        return height;
    }

    private String info() {
        return "Man{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @AcademyInfo(year = "2022")
    private void printHelloWorld(){
        System.out.println("Hello World");
    }
}

