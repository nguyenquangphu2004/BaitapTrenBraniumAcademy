package BaiTapInterFace.QuangPhu;

import java.util.Comparator;

public class Fish extends Animal {
    private String color;
    private String mainEat;

    public Fish() {

    }

    public Fish(String color, String mainEat) {
        this.color = color;
        this.mainEat = mainEat;
    }

    public Fish(Animal animal, Fish fish) {
        super(animal.getName(), animal.getHeight(), animal.getWeight(),
                animal.getEnviroment(), animal.getProducForm());
        this.color = fish.getColor();
        this.mainEat = fish.getMainEat();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMainEat() {
        return mainEat;
    }

    public void setMainEat(String mainEat) {
        this.mainEat = mainEat;
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
class MySortAzFish implements Comparator<Fish> {

    @Override
    public int compare(Fish o1, Fish o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
    class MySortWeightFishRise implements Comparator<Fish> {

        @Override
        public int compare(Fish o1, Fish o2) {
            if(o1.getHeight() > o2.getHeight()) {
                return 1;
            } else if(o1.getWeight() == o2.getWeight()){
                return 0;
            } else {
                return -1;
            }
        }
    }
    class MySortHeightFishDown implements Comparator<Fish> {

        @Override
        public int compare(Fish o1, Fish o2) {
            if(o2.getHeight() > o1.getHeight()) {
                return 1;
            } else if(o2.getHeight() == o1.getHeight()){
                return 0;
            } else {
                return -1;
            }
        }
    }
class MySortWeightFishDown implements Comparator<Fish> {

    @Override
    public int compare(Fish o1, Fish o2) {
        if(o2.getWeight() > o1.getWeight()) {
            return 1;
        } else if(o2.getWeight() == o1.getWeight()){
            return 0;
        } else {
            return -1;
        }
    }
}

