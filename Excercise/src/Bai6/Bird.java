package Bai6;

public class Bird extends Animal{
    private String featherColor;
    private String mainEat;
    private double wingspan;


    public Bird() {

    }

    public Bird(String featherColor, String mainEat, double wingspan) {
        this.featherColor = featherColor;
        this.mainEat = mainEat;
        this.wingspan = wingspan;
    }

    public Bird(Animal animal, Bird bird) {
        super(animal.getName(), animal.getType(), animal.getHeight(), animal.getWeight(), animal.getEnviroment(), animal.getReproductive());
        this.featherColor = bird.getFeatherColor();
        this.mainEat = bird.getMainEat();
        this.wingspan = bird.getWingspan();
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String getMainEat() {
        return mainEat;
    }

    public void setMainEat(String mainEat) {
        this.mainEat = mainEat;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void move() {
        System.out.println("Con chim " + getName() + " đang bay trên trời cao");

    }

    @Override
    protected void relax() {

    }

    @Override
    public String toString() {
        return  super.toString() +"\nBird{" +
                "featherColor='" + featherColor + '\'' +
                ", mainEat='" + mainEat + '\'' +
                ", wingspan=" + wingspan +
                '}';
    }
}
