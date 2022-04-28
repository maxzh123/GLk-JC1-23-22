package by.itAcademy.homeworks.oop.task32;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Appliances {
    public String name;
    public String colour;
    public int expirationDate;
    public int capacity;
    public String onOf ;
    public String turnOnSocket;

    final static Logger logger = LoggerFactory.getLogger(by.itAcademy.homeworks.oop.task32.Appliances.class);

    public Appliances(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTurnOnSocket() {
        return turnOnSocket;
    }

    public void setTurnOnSocket(String turnOnSocket) {
        this.turnOnSocket = turnOnSocket;
    }


    public Appliances(String name, String colour, int expirationDate, int capacity) {
        this.name = name;
        this.colour = colour;
        this.expirationDate = expirationDate;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", expirationDate=" + expirationDate +
                ", capacity=" + capacity +
                ", onOf='" + onOf + '\'' +
                ", turnOn='" + turnOnSocket + '\'' +
                '}';
    }
}
