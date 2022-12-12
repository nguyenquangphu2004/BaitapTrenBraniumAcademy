package Bai7;

public abstract class Transport {
    private String manufacturer; // hãng sản xuất
    private String yearManufacturer ;   //năm sản xuất
    private String whereProduction;     //nơi sản xuất
    private String price ;   //giá thành
    private String  size;        //kicích thước
    private double  weight;       //trọng lượng
    private String licensePlates;        //biển số

    public Transport() {

    }

    public Transport(String manufacturer, String yearManufacturer,
                     String whereProduction, String price, String size,
                     double weight, String licensePlates) {
        this.manufacturer = manufacturer;
        this.yearManufacturer = yearManufacturer;
        this.whereProduction = whereProduction;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.licensePlates = licensePlates;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYearManufacturer() {
        return yearManufacturer;
    }

    public void setYearManufacturer(String yearManufacturer) {
        this.yearManufacturer = yearManufacturer;
    }

    public String getWhereProduction() {
        return whereProduction;
    }

    public void setWhereProduction(String whereProduction) {
        this.whereProduction = whereProduction;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public abstract void startEngine();
    public abstract void endEngine();
    public abstract  void speed();
    public abstract  void brake();
    public abstract  void turnLight();

    @Override
    public String toString() {
        return "Transport{" +
                "manufacturer='" + manufacturer + '\'' +
                ", yearManufacturer='" + yearManufacturer + '\'' +
                ", whereProduction='" + whereProduction + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", licensePlates='" + licensePlates + '\'' +
                '}';
    }
}
