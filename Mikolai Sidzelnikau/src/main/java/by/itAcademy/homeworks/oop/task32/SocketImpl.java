package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.oop.interfeis.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class SocketImpl extends Appliances implements Socket {

    final static Logger logger = LoggerFactory.getLogger(Fridge.class);

    @Override
    public String setOnOf(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите подключить "+name+" или отключить \n Введите on или of");
        onOf = scanner.nextLine();
        if (onOf.equals("on")) {
            logger.info(name+" Подключен к розетке");
        }else {
            logger.info(name+" Отключен от розетки");
        }
        return onOf;
    }

}
