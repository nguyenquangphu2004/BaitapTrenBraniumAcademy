package Bai7;

public class SmallCar extends Car{
    private int numberWindow;
    private int numberSeat;
    private String type;
    private String driveForm;
    private String typeEnery;

    public SmallCar() {

    }

    public SmallCar(Transport transport, Car car, SmallCar smallCar) {
        super(transport, car);
        this.numberWindow = smallCar.getNumberWindow();
        this.numberSeat = smallCar.getNumberSeat();
        this.type = smallCar.getType();
        this.driveForm = smallCar.getDriveForm();
        this.typeEnery = smallCar.getTypeEnery();
    }

    public int getNumberWindow() {
        return numberWindow;
    }

    public void setNumberWindow(int numberWindow) {
        this.numberWindow = numberWindow;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriveForm() {
        return driveForm;
    }

    public void setDriveForm(String driveForm) {
        this.driveForm = driveForm;
    }

    public String getTypeEnery() {
        return typeEnery;
    }

    public void setTypeEnery(String typeEnery) {
        this.typeEnery = typeEnery;
    }

    @Override
    public String toString() {
        return "SmallCar{" +
                "numberWindow=" + numberWindow +
                ", numberSeat=" + numberSeat +
                ", type='" + type + '\'' +
                ", driveForm='" + driveForm + '\'' +
                ", typeEnery='" + typeEnery + '\'' +
                '}';
    }
}
