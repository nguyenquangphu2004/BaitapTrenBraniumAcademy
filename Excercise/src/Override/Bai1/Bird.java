package Override.Bai1;

public class Bird extends Animal{
    private String featherColor;
    private String eatMain;
    private String wingspan; // sải cánh : wingspan;


    public Bird() {

    }

    public Bird(Animal animal, String featherColor,String eatMain, String wingspan) {
        super(animal.getName(),animal.getType(),animal.getHeight(),animal.getWeight(), animal.getEnviroment(),
                animal.getReproductiveForm());
        this.featherColor = featherColor;
        this.eatMain = eatMain;
        this.wingspan = wingspan;

    }

    public final String getFeatherColor() {
        return featherColor;
    }

    public final void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public final String getEatMain() {
        return eatMain;
    }

    public final void setEatMain(String eatMain) {
        this.eatMain = eatMain;
    }

    public final String getWingspan() {
        return wingspan;
    }

    public final void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }
    @Override
    public void drive(String name) {
        System.out.println(name + " đang bay ");
    }
}
