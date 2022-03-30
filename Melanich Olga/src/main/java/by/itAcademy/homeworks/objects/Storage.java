package by.itAcademy.homeworks.objects;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    Map<Money, Integer> storage = new HashMap<>();

    public Storage(Map<Money, Integer> storage) {
        this.storage = storage;
    }

    public Storage() {
    }

    // добавляет деньги в хранилище
    public void addMoney(Money money, Integer number) {
        storage.put(money, number);
    }

    // возвращает сколько денег в хранилище
    public int getSum() {
        int sum = 0;
        for (Map.Entry<Money, Integer> entry : storage.entrySet()) {
            sum += entry.getKey().getBanknote() * entry.getValue();
//            System.out.println("entry.getKey().getBanknoteDenomination() = " + entry.getKey().getBanknote()
//                    + " entry.getValue() = " + entry.getValue());
        }
        return sum;
    }
}
//    public int getBanknoteNumber(Money money){
//        Integer number = storage.get(money);
//        return number;
//    }
//
//    public void takeOutMoney(Money money, Integer amount){
//        storage.replace(money, amount);
//    }
//
//    public Map<Money, Integer> getStorage(){
//        return storage;
//    }
//}
