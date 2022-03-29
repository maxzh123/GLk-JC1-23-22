package by.itAcademy.homeworks.objects;

import java.util.Objects;

public class Money {
    private final int banknote;

    public Money(int banknote) {
        this.banknote = banknote;
    }

    public int getBanknote() {
        return banknote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return banknote == money.banknote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(banknote);
    }
}
