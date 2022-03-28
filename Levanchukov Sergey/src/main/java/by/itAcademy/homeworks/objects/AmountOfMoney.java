package by.itAcademy.homeworks.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AmountOfMoney {
    //Создаем лист для объекта Banknote и метод добавление в этот лист объекта Banknote
    List<Banknote> amountBanknote=new ArrayList<>();

    //Добавление и удаление объектов из массива
    public void addAmountOfBanknote(Banknote b){
        amountBanknote.add(b);
    }
    public void removeAmountOfBanknote(Banknote b){
        amountBanknote.remove(b);
    }

    //метод определяющий тип валюты и возврощающий результат, в случае отсутствия необходимой валюты добавляет ее
   public Map<String,Long> recalculation(){
        Map<String,Long> result=new HashMap();
        for (Banknote b:amountBanknote) {
            if(result.containsKey(b.getCurrency())){
                result.put(b.getCurrency(),result.get(b.getCurrency())+b.getNominal());
            }else {
                result.put(b.getCurrency(),b.getNominal());
            }
        }
        return result;
    }

//    простой метод подсчета одного типа валюты
//    long sum=0;
//    public long sumAddRub(Banknote v){
//        return sum+=v.getNominal();
//   }

}
