package by.itAcademy.homeworks.dataFormats;

import java.util.Locale;
import java.util.ResourceBundle;

public class Task75 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("text_labels");
        System.out.println(rb.getString("money.label"));
    }
}
