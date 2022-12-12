package BaiTapInterFace.QuangPhu;

import java.util.Comparator;

public class Bird extends Animal{


    private String featherColor;
    private String mainEat;
    private String wingspan;

    public Bird() {

    }

    public Bird(String featherColor,String mainEat, String wingspan) {
        this.featherColor = featherColor;
        this.mainEat = mainEat;
        this.wingspan = wingspan;
    }

    public Bird(Animal animal,Bird bird) {
        super(animal.getName(), animal.getHeight(), animal.getWeight(),
                animal.getEnviroment(), animal.getProducForm());
        this.featherColor = bird.getFeatherColor();
        this.mainEat =bird.getMainEat() ;
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

    public String getWingspan() {
        return wingspan;
    }

    public void setWingspan(String wingspan) {
        this.wingspan = wingspan;
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
class MySortAzBird implements Comparator<Bird> {

    @Override
    public int compare(Bird o1, Bird o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class MySortWeightBirdRise implements Comparator<Bird> {

    @Override
    public int compare(Bird o1, Bird o2) {
        if(o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if(o1.getWeight() == o2.getWeight()){
            return 0;
        } else {
            return -1;
        }
    }
}
class MySortHeightBirdDown implements Comparator<Bird> {

    @Override
    public int compare(Bird o1, Bird o2) {
       if(o2.getHeight() > o1.getHeight()) {
           return 1;
       } else if(o2.getHeight() == o1.getHeight()){
           return 0;
       } else {
           return -1;
       }
    }
}
class MySortWeightBirdDown implements Comparator<Bird> {

    @Override
    public int compare(Bird o1, Bird o2) {
        if(o2.getWeight() > o1.getWeight()) {
            return 1;
        } else if(o2.getWeight() == o1.getWeight()){
            return 0;
        } else {
            return -1;
        }
    }
}




