package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.oop.interfeis.SwitchedOnSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SwitchedOnSocketImpl extends Teapot implements SwitchedOnSocket {

    final static Logger logger = LoggerFactory.getLogger(by.itAcademy.homeworks.oop.task32.SwitchedOnSocketImpl.class);

    @Override
    public void setSwitchedOnSocket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы хотите включить Чайник \n Введите on или of");
        String s = scanner.nextLine();
        if (s.equals("on")){
            logger.info("Чайник вкл");
            try {
                TimeUnit.SECONDS.sleep(10);
                logger.info("Чайник закипел и выключился");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if (s.equals("of")){
            logger.info("Чайник выкл");
        }
    }
}
