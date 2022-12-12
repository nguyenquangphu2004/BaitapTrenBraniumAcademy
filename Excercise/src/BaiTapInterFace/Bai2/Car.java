package BaiTapInterFace.Bai2;

public class Car extends Transport{
    private int wheelNumber; // so banh xe;
    private String engineType; // loai dong cco
    private String vehicleName; // ten xe
    private String vehicleColor; // mau sac cua xe;
    private String owner; // chu so huu;

    public Car() {

    }

    public Car(String manufacturer, int yearOfManufacturer,
               String placeOfManufacturer, double price, double size,
               double weight, String numberPlate, int wheelNumber,
               String engineType, String vehicleName, String vehicleColor,
               String owner) {
        super(manufacturer, yearOfManufacturer, placeOfManufacturer, price, size, weight, numberPlate);
        this.wheelNumber = wheelNumber;
        this.engineType = engineType;
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
        this.owner = owner;
    }

    public Car(Transport transport, Car car) {

        super(transport.getManufacturer(), transport.getYearOfManufacturer(),
                        transport.getPlaceOfManufacturer(), transport.getPrice(), transport.getSize(),
                        transport.getWeight(), transport.getNumberPlate());
        this.wheelNumber = car.getWheelNumber();
        this.engineType = car.getEngineType();
        this.vehicleName = car.getVehicleName();
        this.vehicleColor = car.getVehicleColor();
        this.owner = car.getOwner();
    }

    public Car(int wheelNumber, String engineType, String vehicleName,
               String vehicleColor, String owner) {
        this.wheelNumber = wheelNumber;
        this.engineType = engineType;
        this.vehicleName = vehicleName;
        this.vehicleColor = vehicleColor;
        this.owner = owner;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void start() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void speed() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void turnOnLights() {

    }

    @Override
    public int compareTo(Transport o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString() + "Car[" +
                "wheelNumber=" + wheelNumber +
                ", engineType='" + engineType + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                ", vehicleColor='" + vehicleColor + '\'' +
                ", owner='" + owner + '\'' +
                ']';
    }
}
