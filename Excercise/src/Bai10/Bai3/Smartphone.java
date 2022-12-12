package Bai10.Bai3;

public abstract class Smartphone implements ElectronicDeviceAction{
    private String seri;
    private String company;
    private String name;
    private String weight;
    private String batteryCapacity;
    private String size;

    public Smartphone() {

    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void restart(boolean check) {
        if(check == true) {
            System.out.println("-----ĐANG KHỞI ĐỘNG LẠI MÁY-----\n=====VUI LÒNG ĐỢI ÍT PHÚT=====");
        } else {
            System.out.println("=====KHỞI ĐỘNG THẤT BẠI ======");
        }
    }

    public boolean openKeyScreen(String password) {
        //Gỉa sử key của điện thoại là quangphu04;
        if(password.compareTo("quangphu04") == 0) {
            return true;
        } else {
            return false;
        }
    }





}
