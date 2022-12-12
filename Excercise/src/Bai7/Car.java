package Bai7;

public class Car extends Transport{
    private String numberWheel;
    private String motorType;
    private String name;
    private String color;
    private String owner;

    public Car(Transport transport,Car car) {
        super(transport.getManufacturer(), transport.getYearManufacturer(),
                transport.getWhereProduction(), transport.getPrice(),
                transport.getSize(), transport.getWeight(), transport.getLicensePlates());
        this.numberWheel = car.getNumberWheel();
        this.motorType = car.getMotorType();
        this.name = car.getName();
        this.color = car.getColor();
        this.owner = car.getOwner();
    }
    public Car() {

    }

    public Car(String numberWheel, String motorType, String name, String color, String owner) {
        this.numberWheel = numberWheel;
        this.motorType = motorType;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }

    public String getNumberWheel() {
        return numberWheel;
    }

    public void setNumberWheel(String numberWheel) {
        this.numberWheel = numberWheel;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void endEngine() {

    }

    @Override
    public void speed() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void turnLight() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nCar{" +
                "numberWheel='" + numberWheel + '\'' +
                ", motorType='" + motorType + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
