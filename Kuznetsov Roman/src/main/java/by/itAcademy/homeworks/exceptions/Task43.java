package by.itAcademy.homeworks.exceptions;

public class Task43 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        }
        catch(NullPointerException e){
            e.printStackTrace(); //В этом блоке можно делать почти все, что угодно
        }
        System.out.println("TEST OUTPUT"); //Даже после получения эксепшиона наша программа продолжает выполнение
    }
}
