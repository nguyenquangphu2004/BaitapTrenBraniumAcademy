package Bai6;

public class Fish extends Animal{
    private String color;
    private String eat;
    public Fish() {

    }

    public Fish(String color, String eat) {
        this.color = color;
        this.eat = eat;
    }

    public Fish(Animal animal,Fish fish) {
        super(animal.getName(), animal.getType(), animal.getHeight(), animal.getWeight(), animal.getEnviroment(), animal.getReproductive());
        this.color = fish.getColor();
        this.eat = fish.getEat();
    }

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void move() {
        System.out.println("Con cá " +getName() + " đang bơi dưới mặt nước...");

    }

    @Override
    protected void relax() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFish{" +
                "color='" + color + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
