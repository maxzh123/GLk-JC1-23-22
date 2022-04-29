package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.oop.interfeis.Socket;
import by.itAcademy.homeworks.oop.interfeis.SwitchedOnSocket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Teapot extends Appliances  {

    public Teapot(String name, String colour, int expirationDate, int capacity) {
        super(name, colour, expirationDate, capacity);
    }

    public Teapot() {
        super("Чайник", "Черный", 1, 200);
    }

    final static Logger logger = LoggerFactory.getLogger(by.itAcademy.homeworks.oop.task32.Teapot.class);

    public void getOnOf() {
        SwitchedOnSocket socket1 = new SwitchedOnSocketImpl();
        Socket socket = new SocketImpl();
        String r = socket.setOnOf(name);
        if (r.equals("on")){
            setTurnOnSocket(getName()+" Включен");
            socket1.setSwitchedOnSocket();
        }else if (r.equals("of")){
            setTurnOnSocket(getName()+" Выключен");
        }
    }    // розетка
}
