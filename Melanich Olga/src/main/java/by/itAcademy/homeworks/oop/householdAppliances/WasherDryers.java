package by.itAcademy.homeworks.oop.householdAppliances;

public class WasherDryers extends WashingMachine {
    private double maxDryingLoad;
    private boolean isDryingFinished;

    public WasherDryers(double maxLoad, double maxDryingLoad, String brand, String model) {
        super(maxLoad, brand, model);
        this.maxDryingLoad = maxDryingLoad;
    }

    @Override
    public void turnOn() {
        System.out.println("Стирально-сушильная машина включена");
        super.setOn(true);
    }

    @Override
    public void turnOff() {
        System.out.println("Стирально-сушильная машина включена");
        super.setOn(false);
    }

    @Override
    public void washing() {
        super.washing();
        if (isWashingFinished()) {
            System.out.println("Запущен режим сушки.Максимальная загрузка для сушки не более " + maxDryingLoad + "кг");
            isDryingFinished = true;
            System.out.println("Сушка завершена");
        } else {
            System.out.println("Стирка не завершена.Дождитесь окончания стирки");
        }
    }
}
