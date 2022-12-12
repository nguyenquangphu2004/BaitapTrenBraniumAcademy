package Bai10.Bai3;

public interface ElectronicDeviceAction {
    void restart(boolean check);
    void start(boolean check);
    void shutdown(boolean check);
    void turnOfScreen();
    void turnDownVolume();
    void increaseScreenBrightness();
    void connectExternalDevice();

}
