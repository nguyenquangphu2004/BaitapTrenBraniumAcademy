package Override.Bai2;

public class Transport {
    private String manuFacturer;
    private String yearmanuFacturer;
    private String whereProduction;
    private String price;
    private String size;
    private double weight;
    private String licensePlate;

    public Transport() {

    }

    public Transport(String manuFacturer, String yearmanuFacturer, String whereProduction,
                     String price, String size, double weight, String licensePlate) {
        this.manuFacturer = manuFacturer;
        this.yearmanuFacturer = yearmanuFacturer;
        this.whereProduction = whereProduction;
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.licensePlate = licensePlate;
    }

    public final String getManuFacturer() {
        return manuFacturer;
    }

    public final void setManuFacturer(String manuFacturer) {
        this.manuFacturer = manuFacturer;
    }

    public final String getYearmanuFacturer() {
        return yearmanuFacturer;
    }

    public final void setYearmanuFacturer(String yearmanuFacturer) {
        this.yearmanuFacturer = yearmanuFacturer;
    }

    public final String getWhereProduction() {
        return whereProduction;
    }

    public final void setWhereProduction(String whereProduction) {
        this.whereProduction = whereProduction;
    }

    public final String getPrice() {
        return price;
    }

    public final void setPrice(String price) {
        this.price = price;
    }

    public final String getSize() {
        return size;
    }

    public final void setSize(String size) {
        this.size = size;
    }

    public final double getWeight() {
        return weight;
    }

    public final void setWeight(double weight) {
        this.weight = weight;
    }

    public final String getLicensePlate() {
        return licensePlate;
    }

    public final void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void startEngine() { // no may

    }

    public void endEngine() { // tat may

    }

    public void speed() { //tang toc

    }
    public void brake() { //phannh

    }


    public void turnLight() { // bat den

    }


}
