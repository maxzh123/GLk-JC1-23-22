package by.itAcademy.homeworks.oop.AdditionalProblem.Interfaces;

import by.itAcademy.homeworks.oop.AdditionalProblem.Card;

import java.math.BigDecimal;

public interface IPayer<T extends IPayable> {
    /**
     * Метод получения оплаты наличными
     * @param payment
     * @param price
     * @return
     */
    boolean getPayment(BigDecimal payment, BigDecimal price);

    /**
     * Получение оплаты любым платежеспособным предметом(в том числе умным утюгом)
     * @param t
     * @param price
     * @return
     */
    boolean getPayment(T t, BigDecimal price);
}
