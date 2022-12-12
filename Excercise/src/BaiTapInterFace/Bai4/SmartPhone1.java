package BaiTapInterFace.Bai4;

import Bai9.Manager;

public class SmartPhone1 implements  Comparable<SmartPhone1> {
    protected static int index = 0;
    private String id;
    private String brandName; // ten hang
    private String deviceName; // Ten thiet bi
    private int originalPrice;
    private int yearOfManufacture;
    private String screenSize;

    public SmartPhone1(String id, String brandName, String deviceName,
                       int originalPrice, int yearOfManufacture,
                       String screenSize) {
        this.id = id;
        this.brandName = brandName;
        this.deviceName = deviceName;
        this.originalPrice = originalPrice;
        this.yearOfManufacture = yearOfManufacture;
        this.screenSize = screenSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public int compareTo(SmartPhone1 o) {
        if(index == 1) {
            return this.brandName.compareTo(o.getBrandName());
        } else if(index == 2) {
            return this.deviceName.compareTo(o.getDeviceName());
        } else if(index == 3) {
            if(o.getOriginalPrice() > this.originalPrice) {
                return 1;
            }
        } else if(index == 4) {
           if(this.getOriginalPrice() > o.originalPrice) {
                return 1;
            }
        } else if(index == 5) {
            if(this.getOriginalPrice() > o.getOriginalPrice()) {
                return 1;
            }
        }
        return -1;

    }

    @Override
    public String toString() {
        return "SmartPhone1[" +
                "id='" + id + '\'' +
                ", brandName='" + brandName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", originalPrice=" + originalPrice +
                ", yearOfManufacture=" + yearOfManufacture +
                ", screenSize='" + screenSize + '\'' +
                ']';
    }
}
