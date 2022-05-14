package by.itAcademy.homeworks.patterns;

/**Создайте простейший логгер, выводящий сообщения об ошибках в текстовый файл.
 *  Объект логгера должен быть создан с помощью ШП Singleton.
 *  У объекта должен быть обязательным один метод,
 *  получающий на вход текст сообщения об ошибке и записывающий его в файл вместе с информацией о дате и времени происшествия.*/

public class Task69 {
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arr = new ArrayIndexOutOfBoundsException();
        Logger logger = Logger.getLogger();
        try {
            for (int i = 0; i < 10; i++) {
                logger.write(arr.getMessage());
            }
        }catch (Exception e){
            logger.write(e.getMessage());
        }
    }
}
