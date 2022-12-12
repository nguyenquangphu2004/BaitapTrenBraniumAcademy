package Bai7;

public class Coach extends Car{
    private int numberSeat;
    private double weight;
    private String range;
    private double capacity;
    private int guest;

    public Coach() {

    }

    public Coach(int numberSeat, double weight, String range, double capacity, int guest) {
        this.numberSeat = numberSeat;
        this.weight = weight;
        this.range = range;
        this.capacity = capacity;
        this.guest = guest;
    }

    public Coach(Transport transport, Car car, Coach coach) {
        super(transport, car);
        this.numberSeat = coach.getNumberSeat();
        this.weight = coach.getWeight();
        this.range = coach.getRange();
        this.capacity = coach.getCapacity();
        this.guest = coach.getGuest();
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "\nCoach{" +
                "numberSeat=" + numberSeat +
                ", weight=" + weight +
                ", range='" + range + '\'' +
                ", capacity=" + capacity +
                ", guest=" + guest +
                '}';
    }
}
