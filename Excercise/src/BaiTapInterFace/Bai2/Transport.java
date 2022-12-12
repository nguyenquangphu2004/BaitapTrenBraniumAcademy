package BaiTapInterFace.Bai2;

public abstract class Transport implements Comparable<Transport> {
    private String manufacturer; //hang san xuat
    private int yearOfManufacturer;//nam phat hanh
    private String placeOfManufacturer; //noi san xuat
    private double price; // gia thanh
    private double size; // kich thuoc
    private double weight; // can nang tinh theo tin
    private String numberPlate; // bien so xe

    public Transport() {

    }

    public Transport(String manufacturer, int yearOfManufacturer,
                     String placeOfManufacturer, double price, double size,
                     double weight, String numberPlate) {
        this.manufacturer = manufacturer;
        this.yearOfManufacturer = yearOfManufacturer;
        this.placeOfManufacturer = placeOfManufacturer;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.numberPlate = numberPlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getPlaceOfManufacturer() {
        return placeOfManufacturer;
    }

    public void setPlaceOfManufacturer(String placeOfManufacturer) {
        this.placeOfManufacturer = placeOfManufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public abstract void start(); // bat dau chay

    public abstract void turnOff(); // tat may

    public abstract void speed(); // tang toc

    public abstract void brake(); // phanh

    public abstract void turnOnLights(); // Mo den

    @Override
    public int compareTo(Transport o) {
        return o.getYearOfManufacturer() - this.getYearOfManufacturer();
    }

    @Override
    public String toString() {
        return "Transport[" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacturer=" + yearOfManufacturer +
                ", placeOfManufacturer='" + placeOfManufacturer + '\'' +
                ", price='" + price + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", numberPlate='" + numberPlate + '\'' +
                ']';
    }
}
