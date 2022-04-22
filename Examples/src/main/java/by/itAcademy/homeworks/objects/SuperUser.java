package by.itAcademy.homeworks.objects;

import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

public class SuperUser extends User{

    private int суперсила=(int)(100*Math.random());
    public SuperUser(String имя, String фамилия, String отчество, int годРождения) {
        super(имя, фамилия, отчество, годРождения);
        System.out.println("constr");
    }

    public int getСуперсила() {
        return суперсила;
    }

    @Override
    public String getИмя() {
        return "Супер ";//+super.getИмя()
    }


}
