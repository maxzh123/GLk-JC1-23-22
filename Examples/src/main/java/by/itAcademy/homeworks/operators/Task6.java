package by.itAcademy.homeworks.operators;


import by.itAcademy.homeworks.enums.Еда;

public class Task6 {
    public static void main(String[] args) {
        System.out.printf("пример: %d %s\n",5,6);
        int i=0;
        i=i/7;
        Еда a= Еда.Суп;
        switch(a){
            default:
            case Суп:
                System.out.println("Пять");
            case Пюре:
                System.out.println("Восемь");

        }

    }
}
