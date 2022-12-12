package Bai6;

public class Mammal extends Animal
{
    private int numberLeg;
    private String featherColor;
    private int numberTeeth;
    private String behavior;

    public Mammal() {

    }

    public Mammal(int numberLeg, String featherColor, int numberTeeth, String behavior) {
        this.numberLeg = numberLeg;
        this.featherColor = featherColor;
        this.numberTeeth = numberTeeth;
        this.behavior = behavior;
    }

    public Mammal(Animal animal, int numberLeg,String featherColor,int numberTeeth,String behavior) {
        super(animal.getName(), animal.getType(), animal.getHeight(), animal.getWeight(), animal.getEnviroment(), animal.getReproductive());
        this.numberLeg = numberLeg;
        this.featherColor = featherColor;
        this.numberTeeth = numberTeeth;
        this.behavior = behavior;
    }

    public Mammal(String name, String type, double height, double weight, String enviroment, String reproductive, int numberLeg, String featherColor, int numberTeeth, String behavior) {
        super(name, type, height, weight, enviroment, reproductive);
        this.numberLeg = numberLeg;
        this.featherColor = featherColor;
        this.numberTeeth = numberTeeth;
        this.behavior = behavior;
    }

    public int getNumberLeg() {
        return numberLeg;
    }

    public void setNumberLeg(int numberLeg) {
        this.numberLeg = numberLeg;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public int getNumberTeeth() {
        return numberTeeth;
    }

    public void setNumberTeeth(int numberTeeth) {
        this.numberTeeth = numberTeeth;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void move() {

    }

    @Override
    protected void relax() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nMammal{" +
                "numberLeg=" + numberLeg +
                ", featherColor='" + featherColor + '\'' +
                ", numberTeeth=" + numberTeeth +
                ", behavior='" + behavior + '\'' +
                '}';
    }
}
