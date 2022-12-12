package Bai10.Bai2;

public abstract class Car implements Sport{
    private String manufac;
    private String yearManufac;
    private String nameCar;
    private double price;
    private double weight;
    private String type;

    public Car() {

    }

    public Car(String manufac, String yearManufac, String nameCar,
               double price, double weight, String type) {
        this.manufac = manufac;
        this.yearManufac = yearManufac;
        this.nameCar = nameCar;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    public String getManufac() {
        return manufac;
    }

    public void setManufac(String manufac) {
        this.manufac = manufac;
    }

    public String getYearManufac() {
        return yearManufac;
    }

    public void setYearManufac(String yearManufac) {
        this.yearManufac = yearManufac;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        System.out.println(getNameCar() + " dang bat dau tang ga voi toc do " + amount + "km/h");
    }

    @Override
    public void brake() {
        System.out.println(getNameCar() + " da dung phanh an toan");
    }
}
