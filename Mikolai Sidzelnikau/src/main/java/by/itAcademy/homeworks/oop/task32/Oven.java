package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.oop.interfeis.Socket;
import by.itAcademy.homeworks.oop.interfeis.SwitchedOnSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Oven extends Appliances {
    public Oven(String name, String colour, int expirationDate, int capacity) {
        super(name, colour, expirationDate, capacity);
    }

    public Oven(){
        super("Духовка","Красный",2,1000);
    }

    final static Logger logger = LoggerFactory.getLogger(by.itAcademy.homeworks.oop.task32.Oven.class);


    public void getOnOf() {
        Socket socket = new SocketImpl();
        String r = socket.setOnOf(name);
        if (r.equals("on")){
            setTurnOnSocket(getName()+" Включен");
        }else if (r.equals("of")){
            setTurnOnSocket(getName()+" Выключен");
        }
    }    // розетка
}
