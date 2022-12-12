package Bai6;

public class Cat extends Mammal{
    private int age;
    private String habitat;
    private String eyeColor;
    private String petName; //Tên riêng;

    public Cat(int age, String habitat, String eyeColor, String petName) {
        this.age = age;
        this.habitat = habitat;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }


    public Cat(int numberLeg, String featherColor, int numberTeeth, String behavior, int age, String habitat, String eyeColor, String petName) {
        super(numberLeg, featherColor, numberTeeth, behavior);
        this.age = age;
        this.habitat = habitat;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }

    public Cat(Animal animal,Mammal mammal,Cat cat) {
        super(animal,mammal.getNumberLeg(),mammal.getFeatherColor(),mammal.getNumberTeeth(),mammal.getBehavior());
        this.age = cat.getAge();
        this.habitat = cat.getHabitat();
        this.eyeColor = cat.getEyeColor();
        this.petName = cat.getPetName();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCat{" +
                "age=" + age +
                ", habitat='" + habitat + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }

    @Override
    protected void move() {
        System.out.println("Con mèo đang chạy trên mặt đất....");
    }
}
