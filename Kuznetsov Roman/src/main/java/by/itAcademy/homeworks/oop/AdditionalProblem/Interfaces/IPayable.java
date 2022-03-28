package by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces;

import java.math.BigDecimal;

public interface IPayable {
    /**
     * Метод отвечающий за снятия со счета
     *
     * @param money
     * @return
     */
    boolean withdrawMoney(BigDecimal money);

    /**
     * Метод отвечающий за пополнение счета
     *
     * @param money
     * @return
     */
    boolean addMoney(BigDecimal money);
}
