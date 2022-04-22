package by.itAcademy.homeworks.exceptions;

/** Написать собственное исключение от Exception.
 * Сгенерировать код, который будет выбрасывать его и обрабатывать. Результат работы программы вывести на экран.
 */

public class Task44 {
    public static void main(String[] args) {
        String[] UsersNames = {"Alexei", "Sasha", "Ura", "Vladimir"};
        for(String name : UsersNames){
            try {
                if (name.equals("Ura")){
                    throw new BadName(name);
                } else{
                    System.out.println(name + " : Хорошее имя");
                }
            }catch (BadName d){
                System.out.println(d);
            }
        }
    }
}
