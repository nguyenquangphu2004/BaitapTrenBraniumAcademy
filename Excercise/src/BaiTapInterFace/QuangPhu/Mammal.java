package BaiTapInterFace.QuangPhu;

public class Mammal extends Animal{

    private int numberLeg;
    private String featherColor;
    private int numberTeeth;
    private String behaviour;

    public Mammal() {

    }

    public Mammal(int numberLeg, String featherColor, int numberTeeth,
                                    String behaviour) {
        this.numberLeg = numberLeg;
        this.featherColor = featherColor;
        this.numberTeeth = numberTeeth;
        this.behaviour = behaviour;
    }

    public Mammal(Animal animal, int numberLeg, String featherColor,
                  int numberTeeth, String behaviour) {
        super(animal.getName(), animal.getHeight(), animal.getWeight(),
                    animal.getEnviroment(),animal.getProducForm());
        this.numberLeg = numberLeg;
        this.featherColor = featherColor;
        this.numberTeeth = numberTeeth;
        this.behaviour = behaviour;
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

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    protected void eat() {

    }

    @Override
    protected void sleep() {

    }

    @Override
    protected void remove() {

    }

    @Override
    protected void relax() {

    }
}
