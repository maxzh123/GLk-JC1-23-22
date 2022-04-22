package by.itAcademy.homeworks.exceptions;

public class BadName extends Exception{
    public BadName(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage() +  " : " + "Переименуйте пользователя";
    }
}
