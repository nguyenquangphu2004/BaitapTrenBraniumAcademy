package Override.Bai1;

public class Mammal extends Animal {

    private int legNumber;
    private String featherColor;
    private int numberOfteeth;
    private String behavior;


    public Mammal() {

    }

    public Mammal(Animal animal,int legNumber,String featherColor,int numberOfteeth,String behavior) {
        super(animal.getName(),animal.getType(),animal.getHeight(),animal.getWeight(), animal.getEnviroment(), animal.getReproductiveForm());
        this.legNumber = legNumber;
        this.featherColor = featherColor;
        this.numberOfteeth = numberOfteeth;
        this.behavior= behavior;


    }

    public final int getLegNumber() {
        return legNumber;
    }

    public final void setLegNumber(int legNumber) {
        this.legNumber = legNumber;
    }

    public final String getFeatherColor() {
        return featherColor;
    }

    public final void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public final int getNumberOfteeth() {
        return numberOfteeth;
    }

    public final void setNumberOfteeth(int numberOfteeth) {
        this.numberOfteeth = numberOfteeth;
    }

    public final String getBehavior() {
        return behavior;
    }

    public void setHabitat(String habitat) {
        this.behavior = behavior;
    }


}
