package Bai7;

public class ElectricBicycle extends Transport {
    private String color;
    private String battery;
    private double numberKm;
    private String time;

    public ElectricBicycle() {

    }

    public ElectricBicycle(String color, String battery, double numberKm, String time) {
        this.color = color;
        this.battery = battery;
        this.numberKm = numberKm;
        this.time = time;
    }

    public ElectricBicycle(Transport transport,ElectricBicycle electricBicycle) {
        super(transport.getManufacturer(), transport.getYearManufacturer(),
                transport.getWhereProduction(), transport.getPrice(),
                transport.getSize(), transport.getWeight(), transport.getLicensePlates());
        this.color = electricBicycle.getColor();
        this.battery = electricBicycle.getBattery();
        this.numberKm = electricBicycle.getNumberKm();
        this.time = electricBicycle.getTime();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getNumberKm() {
        return numberKm;
    }

    public void setNumberKm(double numberKm) {
        this.numberKm = numberKm;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void endEngine() {

    }

    @Override
    public void speed() {
        System.out.println("40 km/h Toc do toi da");
    }

    @Override
    public void brake() {
        System.out.println("3475375823523");
    }

    @Override
    public void turnLight() {

    }
}
