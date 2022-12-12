package BaiTapInterFace.QuangPhu;

import java.util.Comparator;

public class Cat extends Mammal {
    private int age;
    private String habitat;
    private String eyeColor;
    private String petName;

    public Cat() {

    }

    public Cat(int age, String habitat, String eyeColor, String petName) {
        this.age = age;
        this.habitat = habitat;
        this.eyeColor = eyeColor;
        this.petName = petName;
    }

    public Cat(Animal animal, Mammal mammal,Cat cat) {
        super(animal, mammal.getNumberLeg(), mammal.getFeatherColor(),
                mammal.getNumberTeeth(), mammal.getBehaviour());
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
}
class MySortAzCat implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class MySortWeightCatRise implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if(o1.getWeight() == o2.getWeight()){
            return 0;
        } else {
            return -1;
        }
    }
}
class MySortWeightCatDown implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o2.getWeight() > o1.getWeight()) {
            return 1;
        } else if(o2.getWeight() == o1.getWeight()){
            return 0;
        } else {
            return -1;
        }
    }
}
class MySortHeightCatDown implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o2.getHeight() > o1.getHeight()) {
            return 1;
        } else if(o2.getHeight() == o1.getHeight()){
            return 0;
        } else {
            return -1;
        }
    }
}
