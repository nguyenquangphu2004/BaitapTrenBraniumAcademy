package Bai10.Bai3;

public class Iphone extends Smartphone{

    private String operatingSystem;
    private String whereProduction;
    private String warrantyPeriod;
    private String email;
    private String PhoneNumber;

    public Iphone() {

    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getWhereProduction() {
        return whereProduction;
    }

    public void setWhereProduction(String whereProduction) {
        this.whereProduction = whereProduction;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public void restart(boolean check) {
        super.restart(check);
    }

    @Override
    public void start(boolean check) {
        if(check == true) {
            System.out.println("Xin chào");
        } else {
            System.out.println("Error!");
        }
    }

    @Override
    public void shutdown(boolean check) {

    }

    @Override
    public void turnOfScreen() {

    }

    @Override
    public void turnDownVolume() {

    }

    @Override
    public void increaseScreenBrightness() {

    }

    @Override
    public void connectExternalDevice() {

    }
}
