package by.itAcademy.oop.bankomat;

import java.util.Map;

public interface ManeyStack {
    void addBanknote(Banknote b);
    Map<Currency,Long> calc();
}
