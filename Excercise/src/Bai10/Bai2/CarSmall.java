package Bai10.Bai2;

public class CarSmall extends Car{

    private String owner;
    private String licensePlates;
    private String startDate;
    private String engineType;
    private String numberSeat;

    public CarSmall(String nameCar) {
        setNameCar(nameCar);
    }

    public CarSmall(String owner, String licensePlates, String startDate, String engineType, String numberSeat) {
        this.owner = owner;
        this.licensePlates = licensePlates;
        this.startDate = startDate;
        this.engineType = engineType;
        this.numberSeat = numberSeat;
    }

    public CarSmall(String manufac, String yearManufac, String nameCar, double price, double weight, String type, String owner, String licensePlates, String startDate, String engineType, String numberSeat) {
        super(manufac, yearManufac, nameCar, price, weight, type);
        this.owner = owner;
        this.licensePlates = licensePlates;
        this.startDate = startDate;
        this.engineType = engineType;
        this.numberSeat = numberSeat;
    }

    @Override
    public void turnOfLight(Boolean check) {
        if(check == true) {
            System.out.println(getNameCar()+" dang bat den");
        } else {
            System.out.println(getNameCar() + " den da tat");
        }
    }

    @Override
    public void startEngine() {
        System.out.println(getNameCar() + " dang bat dau no may");
    }

    @Override
    public void endEngine() {
        System.out.println(getNameCar() + " da tat may");
    }

    @Override
    public void speed(float amount) {
        super.speed(amount);
    }

    @Override
    public void brake() {
        System.out.println(getNameCar() + " da dung phanh an toan");
    }
}
