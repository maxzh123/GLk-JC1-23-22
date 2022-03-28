package by.itAcademy.homeworks.oop;

/**
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * бытовую технику. Создать несколько объектов описанных классов, часть из них
 *  включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */

class appliances {

    @Override
    public String toString() {
        return "appliances{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", lifetime=" + lifetime + "hours=" +
                '}';
    }

    private String manufacturer;
    private String serialNumber;
    private String color;
    private int lifetime;


    public String getManufacturer() {return manufacturer;}
    public String getSerialNumber() {return serialNumber;}
    public String getColor() {return color;}
    public int getLifetime() {return lifetime;}
    public boolean turnOn(){return true;}


    public appliances(String manufacturer, String serialNumber, String color, int lifetime) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.color = color;
        this.lifetime = lifetime;

    }
}


    class kitchenAppliances extends appliances{

        @Override
        public String toString() {
            return "kitchenAppliances{" +
                    "function='" + function + '\'' +
                    ", weight=" + weight + "kilogram=" +
                    ", height=" + height + "centimeters=" +
                    ", depth=" + depth + "centimeters=" +
                    ", width=" + width + "centimeters=" +
                    ", wattage=" + wattage + "Watt" +
                    '}';
        }

        public String getFunction() {return function;}
        public double getWeight() {return weight;}
        public double getHeight() {return height;}
        public double getDepth() {return depth;}
        public double getWidth() {return width;}
        public int getWattage() {return wattage;}


        private String function;
        private double weight;
        private double height;
        private double depth;
        private double width;
        private int wattage;


        public kitchenAppliances(String manufacturer, String serialNumber, String color, int lifetime, String function, double weight, double height, double depth, double width, int wattage) {
            super(manufacturer, serialNumber, color, lifetime);
            this.function = function;
            this.weight = weight;
            this.height = height;
            this.depth = depth;
            this.width = width;
            this.wattage = wattage;
        }
    }


    class Cooker extends kitchenAppliances{

        @Override
        public String toString() {
            return "Cooker{" +
                    "type='" + type + '\'' +
                    ", capacity=" + capacity + " liters=" +
                    ", numberOfBurners=" + numberOfBurners +
                    '}';
        }

        private String type;
        private int capacity;
        private  int numberOfBurners;


       public Cooker(String manufacturer, String serialNumber, String color, int lifetime, String function, double weight, double height, double depth, double width, int wattage, String type, int capacity, int numberOfBurners) {
            super(manufacturer, serialNumber, color, lifetime, function, weight, height, depth, width, wattage);
            this.type = type;
            this.capacity = capacity;
            this.numberOfBurners = numberOfBurners;
        }


        public String getType() {return type;}
        public int getCapacity() {return capacity;}
        public int getNumberOfBurners() {return numberOfBurners;}
        public String work(){return "Cook";}

    }


public class Task32 {
    public static void main(String[] args) {
        Cooker cooker = new Cooker("Bosch","7866g54g","White", 12, "Cook", 12.5, 1.2, 1.5,
                1.3, 2000, "Elecric", 60,4);
        if (cooker.turnOn()){
            System.out.println(cooker +"\n" +cooker.work());
        }else System.out.println("Impossible Turn on :(");
    }
}
