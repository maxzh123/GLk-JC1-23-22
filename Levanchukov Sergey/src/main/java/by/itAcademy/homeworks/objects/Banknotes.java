package by.itAcademy.homeworks.objects;

import java.util.HashMap;
import java.util.Map;

public class Banknotes {
    private int banknote;

    public Banknotes(int banknote) {
        this.banknote = banknote;
    }

    public int addBanknote(int banknote){
        return this.banknote+=banknote;
    }

}
