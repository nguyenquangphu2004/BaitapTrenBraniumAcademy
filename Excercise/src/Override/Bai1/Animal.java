
package Override.Bai1;

public class Animal {

    private String name;
    private String type;
    private float height;
    private float weight;
    private String enviroment;
    private String reproductiveForm;

    public Animal() {

    }

    public Animal(String name,String type,float heigth,float weight,
                  String enviroment,String reproductiveForm) {
        this.name = name;
        this.type = type;
        this.height = heigth;
        this.weight = weight;;
        this.enviroment = enviroment;
        this.reproductiveForm = reproductiveForm;


    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }

    public final float getHeight() {
        return height;
    }

    public final void setHeight(float height) {
        this.height = height;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getEnviroment() {
        return enviroment;
    }

    public final void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    public final String getReproductiveForm() {
        return reproductiveForm;
    }

    public final void setReproductiveForm(String reproductiveForm) {
        this.reproductiveForm = reproductiveForm;
    }

    public void sleep(String name) {
        System.out.println(name + " đang đi ngủ xin đừng làm phiền.");

    }

    public void eat() {
        System.out.println(name + " đang nạp năng lượng...");
    }
    public void drive(String name) {
        System.out.println(name +  " đang đi húc nhau");
    }
    public void relax() {
        System.out.println(name + " đang nghe nhạc...");
    }











}
