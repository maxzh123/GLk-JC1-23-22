package by.itAcademy.homeworks.oop.AdditionalProblem;

import by.itAcademy.homeworks.generics.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Parking<T extends Ipayer, B extends Vehicle> {

    private List<ParkingLot> lots = new ArrayList<>();
    private T payer;
    private ParkingType type;
    private int price;

    //Инициализация платной парковки
    public Parking(int capacity, T payer, ParkingType type, int price) {
        for (int i = 0; i < capacity; i++)
            lots.add(new ParkingLot<>(i));
        this.payer = payer;
        this.type = type;
        this.price = price;
    }

    //Инициализация бесплатной парковки
    public Parking(int capacity, ParkingType type) {
        lots = new ArrayList<>(capacity);
        this.type = type;
        this.price = 0;
    }

    //Получить цену за место
    public String getPricePerLot() {
        if (price != 0) {
            return String.format("%d.%02d", (price / 100), (price % 100));
        }
        return "Парковка бесплатна";
    }

    //Метод для парковки ТС при бесплатной парковке
    public String parkVehicle(B vehicle) {
        for (ParkingLot temp : lots) {
            if (!temp.isBusy()&&payer==null) {
                temp.parkVehicle(vehicle);
                return "Машина припаркована на месте " + temp.getNumber();
            }
        }
        return "Свободных мест нету.";
    }

    //Метод для парковки ТС при платной парковке
    public String parkVehicle(B vehicle, int payment) {
        if (payer.getPayment(payment, price)) {
            for (ParkingLot temp : lots) {
                if (!temp.isBusy() && payer != null) {
                    temp.parkVehicle(vehicle);
                    return "Машина припаркована на месте " + temp.getNumber();
                }

            }
        }
        else{
            return "Шеф, деняк недостаточно";
        }
        return "Свободных мест нету.";
    }

    //Метод для взятия машины с парковки
    public boolean getVehicleFromParking(int number) {
        return lots.get(number).takeVehicleBack();
    }
}
