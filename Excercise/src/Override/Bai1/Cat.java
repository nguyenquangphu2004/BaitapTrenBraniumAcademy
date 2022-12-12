package Override.Bai1;

public class Cat extends Mammal{
    private int age;
    private String habitat;
    private String eyeColor;
    private String petName;

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public final String getEyeColor() {
        return eyeColor;
    }

    public final void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public final String getPetName() {
        return petName;
    }

    public final void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public void sleep(String name) {
        System.out.println(name + " Meo meo meo");
    }
}
