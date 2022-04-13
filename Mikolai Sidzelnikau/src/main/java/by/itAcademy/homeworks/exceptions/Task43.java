package by.itAcademy.homeworks.exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**## Задание 43
        > Написать код, который выбрасывает NullPointerException. Написать обработчик
        > этого исключения и вывести на экран сообщение, которое будет содержать описание
        > данного исключения.*/
public class Task43 {
    final static Logger logger = LoggerFactory.getLogger(Task43.class);

    public Task43 getTask43() {
        return getTask43();
    }

    public static void main(String[] args){
        Task43 task43 = null;
        logger.info("Ошибка пустой обьект");
        try {
            task43.getTask43();
        } catch (NullPointerException e) {
            e = new NullPointerException("Ошибка пустой обьект");
            e.printStackTrace();
        }
    }
}
