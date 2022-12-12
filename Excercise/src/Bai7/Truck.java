package Bai7;

public class Truck extends Car {
    private double weight;
    private String purpose;
    private int quanlityGoods;


    public Truck() {
        super();

    }
    public Truck(double weight,String purpose,int quanlityGoods) {
        this.weight = weight;
        this.purpose = purpose;
        this.quanlityGoods = quanlityGoods;
    }


    public Truck(Transport transport,Car car,Truck truck) {
        super(transport, car);
        this.weight = truck.getWeight();
        this.purpose = truck.getPurpose();
        this.quanlityGoods = truck.getQuanlityGoods();
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getQuanlityGoods() {
        return quanlityGoods;
    }

    public void setQuanlityGoods(int quanlityGoods) {
        this.quanlityGoods = quanlityGoods;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTruck{" +
                "weight=" + weight +
                ", purpose='" + purpose + '\'' +
                ", quanlityGoods=" + quanlityGoods +
                '}';
    }
}
