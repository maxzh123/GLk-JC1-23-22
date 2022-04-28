package by.itAcademy.homeworks.oop.task32;

import by.itAcademy.homeworks.oop.interfeis.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fridge extends Appliances {
    String openDoor;
    public Fridge(String name, String colour, int expirationDate, int capacity) {
        super(name, colour, expirationDate, capacity);
    }
    public Fridge(){
        super("Atlante","белый",2,2200);
    }

    public String getOpenDoor() {
        return openDoor;
    }

    public void setOpenDoor(String openDoor) {
        this.openDoor = openDoor;
    }

    final static Logger logger = LoggerFactory.getLogger(Fridge.class);
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
