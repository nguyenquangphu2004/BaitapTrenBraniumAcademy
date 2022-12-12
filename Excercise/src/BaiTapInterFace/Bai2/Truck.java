package BaiTapInterFace.Bai2;

public class Truck extends Car{
    private String tonage; // trong tai;
    private String purposeOfUse;//muc dich su duyng
    private String numberOfGoods; // hang hoa da duoc van chuyen;

    public Truck(String tonage, String purposeOfUse, String numberOfGoods) {
        this.tonage = tonage;
        this.purposeOfUse = purposeOfUse;
        this.numberOfGoods = numberOfGoods;
    }

    public Truck(Transport transport,Car car,Truck truck) {

        super(transport,car);
        this.tonage = truck.getTonage();
        this.purposeOfUse = truck.getPurposeOfUse();
        this.numberOfGoods = truck.getNumberOfGoods();
    }

    public String getTonage() {
        return tonage;
    }

    public void setTonage(String tonage) {
        this.tonage = tonage;
    }

    public String getPurposeOfUse() {
        return purposeOfUse;
    }

    public void setPurposeOfUse(String purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }

    public String getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(String numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }
}
