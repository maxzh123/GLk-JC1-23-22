package by.itAcademy.homeworks.oop.forTask34;

public enum Currency {
    BYN("белки"),USD("вечнозелёные");

    Currency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    private String description;

}

