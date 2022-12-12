package BaiTapInterFace.Bai2;

public class Car1 extends Car{
    private String numberOfDoor;
    private int numberSeat;
    private String vehicleType;



    public Car1(String numberOfDoor, int numberSeat,
                String vehicleType) {

        this.numberOfDoor = numberOfDoor;
        this.numberSeat = numberSeat;
        this.vehicleType = vehicleType;
    }
    public Car1() {

    }

    public Car1(Transport transport, Car car, String numberOfDoor,
                int numberSeat, String vehicleType) {
        super(transport, car);
        this.numberOfDoor = numberOfDoor;
        this.numberSeat = numberSeat;
        this.vehicleType = vehicleType;
    }

    @Override
    public int compareTo(Transport o) {
        if(this.getWeight() > o.getWeight()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Car1[" +
                "Weight='" + getWeight() + '\'' +
                ", numberSeat=" + numberSeat +
                ", vehicleType='" + vehicleType + '\'' +
                ']';
    }
}

